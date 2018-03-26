hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -copyFromLocal plane-data.csv /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -copyFromLocal airports_2.csv /user/trisha/project/airtraffic_control/plane_data_external
hbase shell
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table carriers --m 1 --target-dir /user/trisha/project/airtraffic_control --fields-terminated-by ',' --hive-import --create-hive-table --hive-table trisha_db.airtraffic_control_carrier
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hbase shell
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table carriers --m 1 --target-dir /user/trisha/project/airtraffic_contro/carriers --fields-terminated-by ',' --hive-import --create-hive-table --hive-table trisha_db.airtraffic_control_carrier
hdfs dfs -ls /user/trisha/project/airtraffic_control
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table carriers --m 1 --target-dir /user/trisha/project/airtraffic_control/carriers --fields-terminated-by ',' --hive-import --create-hive-table --hive-table trisha_db.airtraffic_control_carriers
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_contro
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select UniqueCarrier,FlightNum,TailNum,Origin,Dest,TaxiIn,TaxiOut,Cancelled,CancellationCode,Diverted from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 -—hbase-table Trisha_Airline:Airtraffic_control —column-family CF_airline —hbase-row-key TailNum
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select UniqueCarrier,FlightNum,TailNum,Origin,Dest,TaxiIn,TaxiOut,Cancelled,CancellationCode,Diverted from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 -—hbase-table Trisha_Airline:Airtraffic_control -—column-family CF_airline -—hbase-row-key TailNum
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select UniqueCarrier,FlightNum,TailNum,Origin,Dest,TaxiIn,TaxiOut,Cancelled,CancellationCode,Diverted from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 --hbase-table Trisha_Airline:Airtraffic_control --column-family CF_airline --hbase-row-key TailNum

sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select Year,Month,DayofMonth,DayOfWeek,DepTime,CRSDepTime,Arrtime,CRSArrTime,ActualElapsedTime,CRSElapsedTime,AirTime,Distance,TailNum from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 --hbase-table Trisha_Airline:Airtraffic_control --column-family CF_time_and_distance --hbase-row-key TailNum
hbase shell
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select Year,Month,DayofMonth,DayOfWeek,DepTime,CRSDepTime,Arrtime,CRSArrTime,ActualElapsedTime,CRSElapsedTime,AirTime,Distance,TailNum from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 --hbase-table Trisha_Airline:Airtraffic_control --column-family CF_time_and_distance --hbase-row-key TailNum
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select CarrierDelay,WeatherDelay,NASDelay,SecurityDelay,LateAircraftDelay,ArrDelay,DepDelay,TailNum from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 --hbase-table Trisha_Airline:Airtraffic_control --column-family CF_weather --hbase-row-ke
hbase shell
sqoop import --connect jdbc:mysql://52.207.2.108/Airline  --username temp --password temp --query "select * from airtraffic_control WHERE Year=2005 and \$CONDITIONS" --split-by Month --m 2 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_yearly_internal_2005 --hive-import --create-hive-table --hive-table trisha_db.hive_import_2005
cd /sollers/big_data_eng/airtraffic_control/datasets/
ls -lrt
cd /sollers/big_data_eng/airtraffic_control/datasets/dimensions/
ls -lrt
hdfs dfs -put airports_2.csv /user/trisha/project/airtraffic_control/airport2_ext
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airports_1 --m 1 --target-dir /user/trisha/project/airtraffic_control/Airport1_Internal --fields-terminated-by ',' --hive-import --create-hive-table --hive-table trisha_db.Airport1_Internal
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control
hbase shell
hdfs dfs -ls /user/
ssh -i /Users/trishasharma/Downloads/Solller/keypair_sollers_cdh.pem trisha@ec2-52-207-2-108.compute-1.amazonaws.com
hdfs dfs -ls /user/
hdfs dfs -ls -mkdir -p /user/trisha/project/pig/
hdfs dfs -ls mkdir -p /user/trisha/project/pig/
hdfs dfs -mkdir -p /user/trisha/project/pig/
hdfs dfs -mkdir -p /user/trisha/project/pig/plane_data_external_notnull_distinct
hdfs dfs -rmr /user/trisha/project/pig/plane_data_external_notnull_distinct
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -cat /user/trisha/project/pig/plane_data_external_notnull_distinct | head -2
hdfs dfs -ls /user/trisha/project/pig/plane_data_external_notnull_distinct 
hdfs dfs -cat /user/trisha/project/pig/plane_data_external_notnull_distinct/part-r-00000
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table carriers_external --m 1 --target-dir /user/trisha/project/airtraffic_control/carriers_external --fields-terminated-by ',' 
sqoop import ----connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table carriers_external --m 1 --target-dir /user/trisha/project/airtraffic_control/carriers_external --fields-terminated-by ','
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table carriers_external --m 1 --target-dir /user/trisha/project/airtraffic_control/carriers_external --fields-terminated-by ',' 
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table carriers --m 1 --target-dir /user/trisha/project/airtraffic_control/carriers_external --fields-terminated-by ',' 
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/carriers_external
hdfs dfs -cp /user/trisha/project/airtraffic_control/carriers_external part-m-00000 /user/trisha/project/airtraffic_control/carriers_extern
hdfs dfs -ls /user/trisha/project/airtraffic_control/carriers_external
hdfs dfs -cp /user/trisha/project/airtraffic_control/carriers_external part-m-00000 /user/trisha/project/airtraffic_control/carriers_external/carriers.csv
hdfs dfs -cp /user/trisha/project/airtraffic_control/carriers_external part-m-00000 /user/trisha/project/airtraffic_control/carriers_external
hdfs dfs -cp /user/trisha/project/airtraffic_control/carriers_external part-m-00000 /user/trisha/project/airtraffic_control/carriers_external/carriers.csv
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/project/airtraffic_control/carriers_external
hdfs dfs -cp /user/trisha/project/airtraffic_control/carriers_external/part-m-00000
hdfs dfs -cp /user/trisha/project/airtraffic_control/carriers_external/part-m-00000 /user/trisha/project/airtraffic_control/carriers_external/carriers.csv
hdfs dfs -ls /user/trisha/project/
ssh -i /Users/trishasharma/Downloads/Solller/keypair_sollers_cdh.pem trisha@ec2-52-207-2-108.compute-1.amazonaws.com
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/project/airtraffic_control/
ssh -i /Users/trishasharma/Downloads/Solller/keypair_sollers_cdh.pem trisha@ec2-52-207-2-108.compute-1.amazonaws.com
ssh -i /Users/trishasharma/Downloads/Solller/keypair_sollers_cdh.pem trisha@ec2-52-207-2-108.compute-1.amazonaws.com
cd /sollers/big_data_eng/airtraffic_control/datasets/
ls -lrt
kinit
hdfs dfs -ls /
hdfs dfs -ls /user/
hdfs dfs -ls /user/trisha/project/
klist
cd /sollers/big_data_eng/airtraffic_control/datasets/
ls -lrt
cd /sollers/big_data_eng/airtraffic_control/datasets/dimensions/
ls -lrt
hdfs dfs -put plane-data.csv /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -ls /user/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -rmr /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -put plane-data.csv /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -ls /user/trisha/project/airtraffic_control/
pig -x mapreduce
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/plane_data_external/
hdfs dfs -ls /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -put plane-data.csv /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -ls /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -rmr  /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -put plane-data.csv /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -ls  /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -rmr  /user/trisha/project/airtraffic_control/plane_data_external
hdfs dfs -ls  /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/plane_data_external
pig -x mapreduce
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -cat /user/trisha/project/airtraffic_control/airtraffic_control_allyear.csv
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/airtraffic_control_allyear.csv
hbase shell
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select UniqueCarrier,FlightNum,TailNum,Origin,Dest,TaxiIn,TaxiOut,Cancelled,CancellationCode,Diverted from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 --hbase-table Trisha_Airline:Airtraffic_control --column-family CF_airline --hbase-row-key TailNum,FlightNum
scan ''Trisha_Airline:Airtraffic_control'
;







hbase shell
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select Year,Month,DayofMonth,DayOfWeek,DepTime,CRSDepTime,Arrtime,CRSArrTime,ActualElapsedTime,CRSElapsedTime,AirTime,Distance,TailNum,FlightNum from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 --hbase-table Trisha_Airline:Airtraffic_control --column-family CF_time_and_distance --hbase-row-key TailNum,FlightNum
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select CarrierDelay,WeatherDelay,NASDelay,SecurityDelay,LateAircraftDelay,ArrDelay,DepDelay,TailNum,FlightNum from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by TailNum --m 1 --hbase-table Trisha_Airline:Airtraffic_control --column-family CF_weather --hbase-row-key TailNum,FlightNum
hbase shell
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/project/airtraffic_control/plane_data_external
cd /sollers/big_data_eng/airtraffic_control/datasets/
ls -lrt
cd /sollers/big_data_eng/airtraffic_control/datasets/dimensions/plane-data.csv
ls -lrt
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/pig/plane_data_external_notnull_distinct
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select * from airtraffic_control  AND \$CONDITIONS"  --m 1 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_allyear
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select * from airtraffic_control AND \$CONDITIONS" --m 1 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_allyear
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select * from airtraffic_control AND \$CONDITIONS" --m 1 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_allyear --fields-terminated-by ','
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --m 1 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_allyear --fields-terminated-by ','
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airtraffic_control --m 1 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_allyear --fields-terminated-by ','
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/project
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/airtraffic_control_allyear
hdfs dfs -cp /user/trisha/project/airtraffic_control/airtraffic_control_allyear/part-m-00000
hdfs dfs -cp /user/trisha/project/airtraffic_control/airtraffic_control_allyear/part-m-00000 /user/trisha/project/airtraffic_control/airtraffic_control_allyear
hdfs dfs -cp /user/trisha/project/airtraffic_control/airtraffic_control_allyear/part-m-00000 /user/trisha/project/airtraffic_control/airtraffic_control_allyear.csv
pig -x mapreduce
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/project/airtraffic_control/airtraffic_control_yearly_external
cd //sollers/big_data_eng/airtraffic_control/datasets/
ls -lrt
cd //sollers/big_data_eng/airtraffic_control/datasets/facts/
ls -lrt
hdfs dfs -put 2006.csv /user/trisha/project/airtraffic_control/airtraffic_control_yearly_external
hdfs dfs -put 2007.csv /user/trisha/project/airtraffic_control/airtraffic_control_yearly_external
pig -x mapreduce
hbase shell
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/pig/cancelled_distinct
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -chmod -R 775 /user/trisha
hbase shell
hbase
hbase shekk
hbase shell
pig -x mapreduce
kinit trisha
pig -x mapreduce
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -rmr /user/trisha/project/pig/origin_dest
hdfs dfs -rmr /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/.Trash/Current/user/trisha/project/pig
hdfs dfs -mv /user/trisha/.Trash/Current/user/trisha/project/pig /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/
hdfs dfs -mkdir /user/trisha/project/pig/
hdfs dfs -chmod -R 775 /user/trisha/project/pig/
hdfs dfs -mv /user/trisha/.Trash/Current/user/trisha/project/pig /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/
hdfs dfs -rmr /user/trisha/project/pig/origin_dest_distinct
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/pig/pig/
STORE origin_dest_distinct into ‘/user/trisha/project/pig/pig/origin_dest_distinct’ USING PigStorage(‘,’);
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/plane_data_external/
hdfs dfs -ls /user/trisha/project/airtraffic_control/pig/
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -rmr  /user/trisha/project/pig/plane_data_external_notnull_distinct
hdfs dfs -ls /user/trisha/project/pig/pig/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/pig/pig/
hdfs dfs -mv /user/trisha/project/pig/pig/cancelled_distinct /user/trisha/project/pig/
hdfs dfs -mv /user/trisha/project/pig/pig/origin_destination_first_last  /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -rmr /user/trisha/project/pig/pig/
hdfs dfs -rmr /user/trisha/project/airtraffic_contro
hdfs dfs -rmr /user/trisha/project/pig/origin_destination_first_last
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -rmr /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -rmr /user/trisha/project/pig/origin_destination_firstandlast
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/hive/
hdfs dfs -ls /user/trisha/_sqoop
hdfs dfs -ls /user/trisha/.Trash
hdfs dfs -ls /user/trisha/.staging
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/
skip /user/trisha/.Trash
hdfs dfs -rmr skip Trash /user/trisha/.Trash
hdfs dfs -rmr -skip Trash /user/trisha/.Trash
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/.staging
hdfs dfs -rmr -skipTrash /user/trisha/.staging
hdfs dfs -rmr -skipTrash /user/trisha/.Trash
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -rmr /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -skipTrash /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -rmr  -skipTrash /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -ls  -skipTrash /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/prroject/pig
hdfs dfs -ls /user/trisha/project/pig
hdfs dfs -ls /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -rmr /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -ls /user/trisha/project/pig/origin_destination_firstandlast
hdfs dfs -rmr -skipTrash /user/trisha/project/pig/origin_destination_firstandlast
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -rmr -skipTrash /user/trisha/project/pig/origin_destination_first_and_last
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/pig/origin_destination_flight
hdfs dfs -ls /user/trisha/project/pig/
pig -x mapreduce
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/pig
hdfs dfs -ls /user/project/pig/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/airport_Merged
hdfs dfs -ls /user/trisha/project/pig/
hbase shell
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/pig/
hdfs dfs -ls /user/trisha/project/airtraffic_control/
hdfs dfs -ls /user/trisha/project/airtraffic_control/airtraffic_control_allyear
hdfs dfs -ls /user/trisha/project/airtraffic_control
hbase shell
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /sollers/
cd /sollers/big_data_eng/yelp/
ls -lrt
cd /sollers/big_data_eng/yelp/datasets
ls -lrt
cd /sollers/big_data_eng/yelp/datasets/dataset
ls -lrt
java -jar /opt/cloudera/parcels/CDH-5.12.2-1.cdh5.12.2.p0.4/lib/avro/avro-tools.jar
hdfs dfs -mkdir -p /user/trisha/project2/
hdfs dfs -chmod -r 775 /user/trisha/project2/
hdfs dfs -chmod -R 775 /user/trisha/project2/
ls -lrt
cd /sollers/big_data_eng/yelp/datasets/dataset/yelp_dataset.tar
head -5 yelp_dataset.tar
cd /sollers/big_data_eng/yelp/datasets/
ls -lrt
head -5 business.json
head -2 business.json
head -3 business.json
ls -lrt
hdfs dfs -mkdir -p /user/trisha/project2/business
hdfs dfs -put business.json /user/trisha/project2/business
hdfs dfs -ls /user/trisha/
hdfs dfs-chmod -R 775 /user/trisha/project2/business/
hdfs dfs -chmod -R 775 /user/trisha/project2/business/
GRANT ALL ON URI 'hdfs://solrs/opt/local/hive/lib/json-serde-1.3.jar' to role admin_role;
hdfs dfs -ls /user/trisha/project2/
kinit trisha
klist
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -ls /user/trisha/project2/business
hdfs dfs -cat /user/trisha/project2/business/business.json | head -2
hdfs dfs -cat /user/trisha/project2/business/business.json | head -3
hdfs dfs -cat /user/trisha/project2/business | head -5
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -ls /user/trisha/project2/business
hdfs dfs -cat /user/trisha/project2/business/business.json | head -5
cd /sollers/big_data_eng/yelp/datasets/
ls -lrt
hdfs dfs -put /sollers/big_data_eng/yelp/datasets/review.json /user/trisha/project2/
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -put /sollers/big_data_eng/yelp/datasets/tip.json /user/trisha/project2/
hdfs dfs -put /sollers/big_data_eng/yelp/datasets/user.json /user/trisha/project2/
hdfs dfs -cat /user/trisha/project2/review.json | head -3
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -rmr skipTrash /user/trisha/project2/review.json
hdfs dfs -rmr skipTrash /user/trisha/project2/tip.json
hdfs dfs -rmr skipTrash /user/trisha/project2/user.json
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -mkdr -p /user/trisha/project2/tip_json
hdfs dfs -mkdir -p /user/trisha/project2/tip_json
hdfs dfs -mkdir -p /user/trisha/project2/review_json
hdfs dfs -mkdir -p /user/trisha/project2/user_json
hdfs dfs -put /sollers/big_data_eng/yelp/datasets/user.json /user/trisha/project2/user_json
hdfs dfs -put /sollers/big_data_eng/yelp/datasets/tip.json /user/trisha/project2/tip_json
hdfs dfs -put /sollers/big_data_eng/yelp/datasets/review.json /user/trisha/project2/review_json
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -ls /user/trisha/project2/tip_json
hdfs dfs -cat /user/trisha/project2/review_json | head -3
hdfs dfs -cat /user/trisha/project2/review_json/review.json | head -3
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -ls /user/trisha/project2/user_json/
hdfs dfs -ls /user/trisha/project2
hdfs dfs -ls /user/trisha/project2/user_json
hdfs dfs -mkdir /user/trisha/project2/user_json/totalreview1
hdfs dfs -ls /user/trisha/project2/user_json
hdfs dfs -ls /
hdfs dfs -ls /user
hdfs dfs -ls /user/trisha

hdfs dfs -ls /user/trisha/project2/
hdfs dfs -ls /user/trisha/project2/totalreview1
hdfs dfs -cat /user/trisha/project2/totalreview1/part-r-00001 | head
hdfs dfs -rmr skip.Trash /user/trisha/project2/totalreview1
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/.Trash
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -ls /user/trisha/project2/result_totalreview1
hdfs dfs -cat /user/trisha/project2/result_totalreview1/part-r-00001 | head
hdfs dfs -rmr skipTrash /user/trisha/project2/result_totalreview1
hdfs dfs -ls /user/trisha/project2/
kinit trisha
klist
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -ls /user/trisha/project2/business
pig -x mapreduce
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -cat /user/trisha/project2/result_1/ | head
hdfs dfs -ls /user/trisha/project2/result_1
hdfs dfs -cat /user/trisha/project2/result_1/part-r-00001  | head
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/project/
hdfs dfs -ls /user/trisha/project/airtraffic_control
hdfs dfs -ls /user/trisha/project/pig
pig -x mapreduce
hdfs dfs -ls /user/trisha/
kinit trisha
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/project2
hdfs dfs -ls /user/trisha/project2/user_json/
hdfs dfs -ls /user/trisha/project2/business/
hdfs dfs -ls /user/trisha/project2/
grunt
pig -x mapreduce
hdfs dfs -ls /user/trisha/
kinit trisha
hdfs dfs -ls /user/trisha/
pig -x mapreduce
hdfs dfs -ls /user/trisha/project2/
hdfs dfs -mkdir -p /user/trisha/orders/
kinit trisha
hdfs dfs -mkdir -p /user/trisha/orders/
hdfs dfs -chmod -R 775 /user/trisha/orders/
cd /sollers/
ls -lrt
cd /sollers/big_data_eng
ls -lrt
cd /sollers/big_data_eng/pig/
ls -lrt
cd /sollers/big_data_eng/pig/datasets/
ls -lrt
hdfs dfs -put Orders.csv /user/trisha/orders
pyspark2
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/orsers
hdfs dfs -ls /user/trisha/orders
pyspark2
pyspark 2
kinit trisha
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select * from airtraffic_control where Year=2003 AND \$CONDITIONS" --split-by year,month --m 2 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_yearly_externaltest
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select * from airtraffic_control WHERE Year=2003 AND \$CONDITIONS" --split-by Year,month --m2 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_yearly_exteernaltest
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select * from airtraffic_control WHERE Year=2003 AND \$CONDITIONS" --split-by Year,month --m1 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_yearly_exteernaltest
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --query "select * from airtraffic_control WHERE Year=2003 AND \$CONDITIONS" --split-by Year,month --m 1 --delete-target-dir --target-dir /user/trisha/project/airtraffic_control/airtraffic_control_yearly_exteernaltest
su - anuj
exit
mkdir shell
cd shell
vi connect.sh
kinit trisha
./connect.sh
chmod 775 connect.sh
./connect.sh
vi connect.sh
./connect.sh
beeline
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
vi tables.sh
./tables.sh
chmod 775 tables.sh
./tables.sh
echo $SHELL
pyspark2
kinit trisha
klist
pyspark2
kinit list
cd /sollers/big_data_eng/project/scd/
ls -lrt
cd /sollers/big_data_eng/project/scd/dataset
ls -lrt
cd /sollers/big_data_eng/project/scd/dataset/
hdfs dfs -cat /sollers/big_data_eng/project/scd/dataset/EmployeeDeptUpdate1.csv | head -2
kinit trisha
hdfs dfs -cat /sollers/big_data_eng/project/scd/dataset/EmployeeDeptUpdate1.csv | head -2
cat /sollers/big_data_eng/project/scd/dataset/EmployeeDeptUpdate1.csv | head -2
hdfs dfs mkdir -p /user/trisha/project3/
hdfs dfs -mkdir -p /user/trisha/project3/
hdfs dfs -chmod -R 775 /user/trisha/project3
hdfs dfs -ls /user/trisha/
hdfs dfs -rmr /skipTrash/user/trisha/project
hdfs dfs -rmr /skipTrash/user/trisha/project/
hdfs dfs -ls /user/trisha/
hdfs dfs -rmr skipTrash /user/trisha/project
sqoop import --connect jdbc:mysql://52.207.2.108/AdventureWorks2014 --username temp --password temp --table Employee_Status --m 1 --target-dir /user/trisha/project3/sqoop/employee --fields-terminated-by ','
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/project3
hdfs dfs -ls /user/trisha/project3/sqoop/
hdfs dfs -rmr skipTrash /user/trisha/project2
sqoop import --connect jdbc:mysql://52.207.2.108/AdventureWorks2014 --username temp --password temp --table Department --m 1 --target-dir /user/trisha/project3/sqoop/department --fields-terminated-by ','
cat /sollers/big_data_eng/project/scd/dataset/EmployeeDeptUpdate1.csv | head -4
cd /user/trisha/project3/
hdfs dfs -ls /user/trisha/project3/
hdfs dfs -ls /user/trisha/project3/sqoop/
hdfs dfs -ls /user/trisha/project3/sqoop/employee
hdfs dfs -cat  /user/trisha/project3/sqoop/employee/part-m-00000
hdfs dfs -cat  /user/trisha/project3/sqoop/employee/part-m-00000 | head -2
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/project3/
hdfs dfs -ls /user/trisha/project3/sqoop/
hdfs dfs -ls /user/trisha/project3/sqoop/employee
hdfs dfs -ls /user/trisha/project3/
hdfs dfs -ls /user/trisha/project3/sqoop/
hdfs dfs -ls /user/trisha/project3/sqoop/employee
hdfs dfs -cat /user/trisha/project3/sqoop/employee/part-m-00000 | head -2
hdfs dfs -ls /user/trisha/project3/sqoop/
hdfs dfs -mkdir -p /user/trisha/project3/updatedfile
hdfs dfs -put EmployeeDeptUpdate1.csv /user/trisha/project3/updatedfile
cd /sollers/big_data_eng/projecy/scd/dataset/
cd /sollers/big_data_eng/project/scd/dataset/
ls -lrt
cd /user/trisha/project3/
hdfs dfs -put EmployeeDeptUpdate1.csv /user/trisha/project3/updatedfile
hdfs dfs -put EmployeeDeptUpdate2.csv /user/trisha/project
pyspark2
pyspark2
hdfs dfs -ls /user/trisha/project3/
hdfs dfs -ls /user/trisha/project3/sqoop/
hdfs dfs -mv /user/trisha/project3/sqoop/employee
hdfs dfs -mv /user/trisha/project3/sqoop/employee/part-m-00000 /user/trisha/project3/sqoop/employee/employee.csv
hdfs dfs -ls /user/trisha/project3/
hdfs dfs -ls /user/trisha/project3/sqoop/
hdfs dfs -ls /user/trisha/project3/sqoop/department
/user/trisha/project3/sqoop/department/part-m-00000
hdfs dfs -mv /user/trisha/project3/sqoop/department/part-m-00000 /user/trisha/project3/sqoop/department/department.csv
pyspark2
hdfs dfs -ls /user/trisha/
ec2-52-207-2-108.compute-1.amazonaws.com
hdfs dfs -ls /user/trisha/project3/
hdfs dfs -ls /user/trisha/project3/updatedfile
hdfs dfs -cat /user/trisha/project3/updatedfile/EmployeeDeptUpdate1.csv | ehad -3
hdfs dfs -cat /user/trisha/project3/updatedfile/EmployeeDeptUpdate1.csv | head -3
hdfs dfs -ls /
hdfs dfs -ls /hadoop
mysql -u temp -p
pyspark2
kinit
pyspark2
mysql -u temp -p
vi
kinit
beeline http://ec2-54-224-184-22.compute-1.amazonaws.com:7180/cmf/home
vi connect.sh
./connect.sh
chmod 775 connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
 
vi select.sh
./select.sh
chmod 775 select.sh
./select.sh
kinit
./select.sh
vim shell
./connect.sh
./select.sh
vi connect.sh
vim
./xyz
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
vi shell.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
bash connect.sh
vi connect.sh
bash connect.sh
vi connect.sh
bash connect.sh
vi connect.sh
./connect.sh
vi connect.sh
bash connect.sh
vi connect.sh
bash connect.sh
vi connect.sh
vi sql.sh
./sql.sh
vi sql.sh
chmod 775 sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi sql.sh
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/_sqoop
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/_sqoop
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind 
hdfs dfs -cat /user/trisha/northwind/part-m-00000 |head -5 
hdfs dfs -ls /user/
hdfs dfs -ls /user/hdfs/
hdfs dfs -ls /user/hive/
hdfs dfs -ls /user/hive/warehouse
hdfs dfs -ls /
hdfs dfs -ls /hive
hdfs dfs -ls /hive/external
hdfs dfs -ls /user/trisha
hdfs dfs -rmr skipTrash /user/trisha/northwind
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -ls /user/trisha/northwind/part-m-00000
hdfs dfs -cat /user/trisha/northwind/part-m-00000 | head
hdfs dfs chmod -R 775 /user/trisha/
hdfs dfs -chmod -R 775 /user/trisha/
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
myscript.sh
vi myscript.sh
./connect.sh
./myscript.sh
chmod 775 myscrpit.sh
vi myscript.sh
./myscript.sh
-chmod 775 myscrpit.sh
ls -chmod 775 myscript.sh
./myscript.sh
vi myscript.sh
./myscript.sh
vi myscript.sh
./myscript.sh
vi myscript.sh
./myscript.sh
chmod 775 myscript.sh
./myscript.sh
vi myscript.sh
./myscript.sh
vi myscript.sh
./myscript.sh
vi myscript.sh
./myscript.sh
vi myscript.sh
./myscript.sh
vi myscript.sh
kinit
hdfs dfs -ls /user/trisha
hdfs dfs -ls /user/trisha/orders
vi input
vi test.sh
chmod 775 test.sh
./test.sh
vi test.sh
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -ls /user/trisha/northwind/Employees
vi input
vi connect.sh
vi script.sh
vi sqoop.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi sql.sh
./sql.sh
vi inputfile.sh
./inputfile.sh
vi inputfile.sh
./inputfile.sh
vi inputfile.sh
./inputfile.sh
vi inputfile.sh
vi sql.sh
./sql.sh
vi sql.sh
vi inputfile.sh
vi input
vi sql.sh
vi input
vi sql.sh
vi sqoop.sh
./sqoop.sh
vi sqoop.sh
./sqoop.sh
cd shell
chmod 775 sqoop.sh
vi sqoop.sh
./sqoop.sh
vi sqoop.sh
./sqoop.sh
vi sqoop.sh
hdfs dfs -ls
hdfs dfs -ls /user/trisha
vi input
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/hive
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
hdfs df s-ls /user/trisha/
hdfs dfs -ls /user/trisha/
kinit
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -cat /user/trisha/northwind/Shippers | head
hdfs dfs -cat /user/trisha/northwind/Shippers
hdfs dfs -ls /user/trisha/northwind/Shippers
hdfs dfs -cat /user/trisha/northwind/Shippers/part-m-00000
[A
hdfs dfs -cat /user/trisha/northwind/Shippers/part-m-00000 | head 
hdfs dfs -rmr skipTrash /user/trisha/northwind/
vi sql.sh
vi connect.sh
hdfs dfs -ls /user/trisha
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -ls /user/trisha/northwind/Categories
hdfs dfs -ls /user/trisha/northwind/Categories/part-m-00000 | head 
hdfs dfs -cat /user/trisha/northwind/Categories/part-m-00000 | head 
hdfs dfs -rmr skipTrash /user/trisha/northwind
hdfs dfs -ls /user/trisha
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -cat /user/trisha/northwind/part-m-00000 | head
hdfs dfs -rmr skipTrash /user/trisha/northwind
hdfs dfs -cat /user/trisha/northwind/part-m-00000 | head
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -cat /user/trisha/northwind/part-m-00000 | head
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -cat /user/trisha/northwind/part-m-00000 | head
hdfs dfs -chmod 775 -R /user/trisha/northwind
hdfs dfs -chmod -R 775  /user/trisha/northwind
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -cat /user/trisha/northwind/part-m-00000
vi sqoop.sh
chmod 775 sqoop.sh
./sqoop.sh
vi sqoop.sh
./sqoop.sh
vi sqoop.sh
ls
./sqoop.sh
vi sqoop.sh
vi inpufile
vi input
vi sqoop.sh
./sqoop.sh
vi sqoop.sh
./sqoop.sh
vi sqoop.sh
./sqoop.sh input
vi input
./sqoop.sh input
vi sqoop.sh
./sqoop.sh input
vi input
./sqoop.sh input
vi sqoop.sh
./sqoop.sh input
vi sqoop.sh
./sqoop.sh input
vi input
./sqoop.sh input
vi input
vi sqoop.sh
vi input
vi sqoop.sh
vi input
vi sqoop.sh
vi hive.sh
chmod 775 hive.sh
./hive.sh
kinit trisha
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
kinit
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi script.sh
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
hive -f myscript.hql
vi script.sh
vi connect.sh
./coonect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
kinit
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
./connect.sh
vi connect.sh
vi table.sh
./tables.sh
./table.sh
chmod 775 table.sh
./table.sh
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -ls /user/trisha/northwind/Employees
hdfs dfs -ls /user/trisha/
kinit trisha
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
pyspark2
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -ls /user/trisha/northwind/employees
hdfs dfs -ls /user/trisha/northwind/Employees
hdfs dfs -mv /user/trisha/northwind/Employees/part-m-00000 /user/trisha/northwind/Employee.csv
hdfs dfs -ls /user/trisha/northwind/
hdfs dfs -cat /user/trisha/northwind/Employee.csv | head
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /warehouse
hdfs dfs -ls /hive/warehouse
hdfs dfs -ls 
ls -lrt
pyspark2
pyspark
pyspark2
kinit
kinit trisha
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/orders
hdfs dfs -cat /user/trisha/orders/orders.csv | head -2
hdfs dfs -cat /user/trisha/orders/Orders.csv | head -2
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/project
sqoop import --connect jdbc:mysql://52.207.2.108/northwind --username temp --password temp -- table Customers --m 1 --target-dir /user/trisha/customers --fields-terminated-by ','
sqoop import --connect jdbc:mysql://52.207.2.108/northwind --username temp --password temp --table Customers --m 1 --target-dir /user/trisha/customers --fields-terminated-by ','
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/customers
hdfs dfs -mv /user/trisha/customers/part-m-00000 /user/trisha/customers.csv
hdfs dfs -ls /user/trisha/customer
hdfs dfs -cat /user/trisha/customer.csv | head 
hdfs dfs -cat /user/trisha/customers.csv | head 
hdfs dfs -ls /user/trisha/customers.csv 
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/customers
hdfs dfs -ls /user/trisha/customers/_SUCCESS
hdfs dfs -ls /user/trisha/project
hdfs dfs -ls /user/trisha/project/project
hdfs dfs -ls /user/trisha/_sqoop
hdfs dfs -ls /user/trisha/project3
hdfs dfs -ls /user/trisha/project3/sqoop
hdfs dfs -ls /user/trisha/project3/sqoop/department
kinit trisha
hdfs dfs -ls /user/trisha
sqoop import --connect jdbc:mysql://52.207.2.108/northwind --username temp --password temp --table Customers --m 1 --target-dir /user/trisha/customers1 --fields-terminated-by ','
hdfs dfs -ls /user/trisha
pyspark2
kinit trisha
hdfs dfs -ls /user/trisha/
hdfs dfs -rmr skipTrash /user/trisha/customers
hdfs dfs -rmr skipTrash /user/trisha/customers.csv
hdfs dfs -cat /user/trisha/customers1 | head
hdfs dfs -ls /user/trisha/customers1
hdfs dfs -cat /user/trisha/customers1/part-m-00000 | head
hdfs dfs -ls /user/trisha/project
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/project3
hdfs dfs -ls /user/trisha/project3/sqoop
hdfs dfs -ls /user/trisha/project3/sqoop/department
hdfs dfs -cat /user/trisha/project3/sqoop/department/department.csv | head
python
cd
hdfs dsf -du -h
hdfs dfs -du -h
kinit
hdfs dfs -du -h
hdfs dfs -rm -r -skipTrash /user/trisha/Employees customers1
hdfs dfs -ls /user/trisha
hdfs dfs -rm -r -skipTrash /user/trisha/.Trash .sparkStaging .staging orders
hdfs dfs -ls /user/trisha/project
hdfs dfs -ls /user/trisha
hdfs dfs -cat /user/trisha/project
hdfs dfs -rm -r -skipTrash /user/trisha/project
hdfs dfs -ls /user/trisha
su anuj
pyspark2
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -cat /user/trisha/northwind/Employee.csv | head -2
hdfs dfs -ls /user/trisha/project3
cd /sollers/
ls 
cd /sollers/sqoop_tables
cd /sollers/big_data_eng
ls

ls 
cd /sollers/big_data_eng/pig
ls
cd /sollers/big_data_eng/pig/datasets
ls
hdfs dfs -put Orders.csv /user/trisha/project3
kinit trisha
hdfs dfs -ls /user/trisha/project3
vi tables.sh
vi sqoop.sh
pyspark2
pyspark
kinit trisha
pyspark2
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/_sqoop
hdfs dfs -ls /user/trisha/project3
hdfs dfs -ls /user/trisha/project3/sqoop
hdfs dfs -ls /user/trisha/project3/sqoop/employee
hdfs dfs -cat /user/trisha/project3/sqoop/employee/employee.csv | head -2
spark2-shell
vi HelloWorld.scala
hdfs dfs -ls /user/trisha
vi tables.txt
vi tabletest.txt
vi sqoop.sh
cp sqoop.sh testsqoop.sh
vi testsqoop.sh
./sqoop.sh
vi sqoopparallel.sh
hdfs dfs -ls /user/trisha
hdfs dfs -ls /user/trisha/northwind
hdfs dfs -ls /user/trisha/northwind/Orders
hdfs dfs -cat /user/trisha/northwind/Orders/part-m-00000 | head -2
pyspark2
kinit trisha
vi sqoop.sh
pyspark2
kinit trisha
hdfs dfs -mkdir -p /user/trisha/airtraffic
hdfs dfs -chmod 775 /user/trisha/airtraffic
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airports_1 --m 1 --target-dir /user/trisha/project/airtraffic --fields-terminated-by ',' --hive-import --create-hive-table --hive-table trisha_db.airtraffic_spark
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airtraffic_control --m 1 --target-dir /user/trisha/project/airtraffic --fields-terminated-by ',' --hive-import --create-hive-table --hive-table trisha_db.airtraffic_spark
hdfs dfs -ls /user/trisha/airtraffic
hdfs dfs -ls /user/trisha
hdfs dfs -ls /user/trisha/airtraffic
hdfs dfs -rmr skipTrash /user/trisha/airtraffic
hdfs dfs -rmr .skipTrash /user/trisha/airtraffic
hdfs dfs -rmr skipTrash /user/trisha/airtraffic
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airtraffic_control --m 1 --target-dir /user/trisha/project/airtraffic --fields-terminated-by ',' --hive-import --create-hive-table --hive-table trisha_db.airtraffic_spark
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airtraffic_control --m 1 --target-dir /user/trisha/project/airtraffic --fields-terminated-by ',' --hive-import --create-hive-table --hive-table trisha_db.airtraffic_spark
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airtraffic_control --m 1 --target-dir /user/trisha/project/airtraffic --fields-terminated-by ','
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airtraffic_control --m 1 --target-dir /user/trisha/airtraffic --fields-terminated-by ','
sqoop import --connect jdbc:mysql://52.207.2.108/Airline --username temp --password temp --table airtraffic_control --m 1 --delete-target-dir  --target-dir /user/trisha/airtraffic --fields-terminated-by ','
hdfs dfs -ls /user/trisha/northwind
vi date.sh
spark-shell.shh
spark-shell.sh
cd shell
ls
vi spark-shell.sh
vi hivetables.sh
vi spark-shell.sh
vi hivetables.sh
vi spark-shell.sh
vi sqoop.sh
vi spark-shell.sh
kinit trisha
pyspark2
kinit trisha
pyspark2
hdfs dfs -ls /user/trisha/
kinit trisha
hdfs dfs -ls /user/trisha/
hdfs dfs -ls /user/trisha/northwind/
vi sqoop.sh
cd shell
ls
vi sqoopparallel.sh
vi config.sh
ls
pyspark2
kinit trisha
pyspark2
