JDBC=jdbc:mysql://52.207.2.108
UNAME=temp
PASS=temp
DATA_COLLECTOR=/user/trisha/northwind
QUEUE_NAME=default
mydbname=trisha_db
DBNAME=northwind


while read line;
do

 DBNAME=`echo $line | cut -d'.' -f1`
 TABLENAME=`echo $line | cut -d'.' -f2`

sqoop import -Dmapreduce.job.queuename=$QUEUE_NAME --connect $JDBC/$DBNAME --username=$UNAME --password=$PASS --table $TABLENAME --delete-target-dir --target-dir $DATA_COLLECTOR/$TABLENAME --fields-terminated-by ',' --m 1

done<input


