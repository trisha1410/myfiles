source config.sh
source sqoop.sh

#bash sqoop.sh rmhdfsdir
#bash sqoop.sh mkhdfsdir
#bash sqoop.sh DeleteHiveTables $1 &> deletehivetables.log
bash sqoop.sh showtables &> HiveTables.txt

function popStack(){
        : ${1?'Missing stack name'}

        # check if array not void
        local pointerStack=$(<$pointerStackFile)
        [ $pointerStack -ge $initialSizeStack ] && return 1

        eval "$1"=${listOfTables[$pointerStack]}

        (( pointerStack=$pointerStack+1))
        echo $pointerStack > $pointerStackFile
        return 0
}

function doSqoop(){
        local id=$1     # this id should be unique betwween all the instances of doSqoop
        local myVariable=tableFor_$id
        local logFileSummary=$databaseBaseDir/process_$id-summary.log
        local logFileRaw=$databaseBaseDir/process_$id-raw.log


        popStack $myVariable
        [ $? -ne 0 ] && break

        local myTable=${!myVariable// /_}
        local myTableOrigin=${!myVariable}
        local origTable=$myTableOrigin


        for table in $myTable
        do
                echo $table
                if grep -w -i "$table" HiveTables.txt && $(hadoop fs -test -d $DIR_PATH/$table)
                then
                        echo "$table already exists in HDFS Direcotry and Hive DB."
                        echo ""
                else
                        if grep -w -i "$table" HiveTables.txt
                        then
                                echo "$table already exists in Hive DB. Let's check in HDFS directory..."
                                echo ""
                        else
                                echo "Sqooping $table to Hive DB..."
                                echo ""
                                sqoop import --connect jdbc:mysql://$HOSTNAME/$MYSQL_DB --username $USERNAME --password $PASS --m 1 --table $origTable --delete-target-dir --target-dir $DIR_PATH/$myTable --fields-terminated-by ',' --hive-import --create-hive-table --hive-table $HIVE_DB.$myTable >> $logFileRaw 2>> $logFileRaw
                        fi

                        if $(hadoop fs -test -d $DIR_PATH/$table)
                        then
                                echo "$table already exists in HDFS directory."
                                echo ""
                        else
                                echo "Sqooping $table HDFS directory..."
                                echo ""
                                sqoop import --connect jdbc:mysql://$HOSTNAME/$MYSQL_DB --username $USERNAME --password $PASS --m 1 --table $origTable --delete-target-dir --target-dir $DIR_PATH/$myTable --fields-terminated-by ',' >> $logFileRaw 2>> $logFileRaw

                                bash sqoop.sh csv $table
                        fi
                fi
        done

#        while true; do
#
#                # get the name of the next table to sqoop
#                popStack $myVariable
#                [ $? -ne 0 ] && break
#
#                local myTable=${!myVariable// /_}
#                local myTableOrigin=${!myVariable}
#                local origTable=$myTableOrigin
#
#                echo "Creating $myTable Directory and Hive Table"
#
#                sqoop import --connect jdbc:mysql://$HOSTNAME/$MYSQL_DB --username=temp --password=temp --m 1 --table $origTable --delete-target-dir --target-dir $DIR_PATH/$myTable --fields-terminated-by ',' --hive-import --create-hive-table --hive-table $HIVE_DB.$myTable >> $logFileRaw 2>> $logFileRaw
#
#                sqoop import --connect jdbc:mysql://$HOSTNAME/$MYSQL_DB --username=temp --password=temp --m 1 --table $origTable --delete-target-dir --target-dir $DIR_PATH/$myTable --fields-terminated-by ',' >> $logFileRaw 2>> $logFileRaw
#
#                echo "Table $myTable is scoopes and created in $HIVE_DB"
#
#        done
}

function usage() {
        echo -e "usage:\t`basename $0` [-M <source database>] [-H <hive database>] [-S <source server>] [-P <PARALLELISM>] <filename>"
        echo -e "usage:\t`basename $0` -U"

        exit 0
}

while getopts "M:U:H:S:P:" FLAG; do
  case $FLAG in
    M)  MYSQL_DB=$OPTARG
      ;;
    U)  usage
      ;;
    H)  HIVE_DB=$OPTARG
      ;;
    S)  HOSTNAME=$OPTARG
      ;;
    P)  PARALLELISM=$OPTARG
      ;;
    \?) #unrecognized option - show help
      echo -e \\n"Option -${BOLD}$OPTARG${NORM} not allowed."
      usage
      ;;
  esac
done

shift $((OPTIND-1))  #This tells getopts to move on to the next argument.

# TODO: check if the argument is a file. If not, consider this is a list of table

myFile=$1
[ "x$myFile" = "x" ] && usage
[ -f $myFile ] || usage
IFS="
"
listOfTables=(`cat $myFile`)
initialSizeStack=${#listOfTables[@]}
pointerStack=0  # to know which element must be fetched next
pointerStackFile=/dev/shm/.sqoopTables_pointerStack_$$
echo 0 > $pointerStackFile

databaseBaseDir=$BASE_DIR/$MYSQL_DB-$HIVE_DB
[ -d $databaseBaseDir ] || mkdir -p $databaseBaseDir
for i in `seq $PARALLELISM`; do
        sleep 0.1 # to avoid subprocesses to pop the stack at the same time
        (doSqoop $i) &
done

wait

#bash sqoop.sh csv $1 &> csv.log
#bash sqoop.sh listdir $1 #&> listdir.log

rm *.log
rm *.java
rm -f $pointerStackFile
