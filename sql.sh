HOSTNAME="jdbc:hive2://ec2-52-207-2-108.compute-1.amazonaws.com:10000"
DB="trisha_db"
PRINCIPAL="principal=hive://ec2-52-207-2-108.compute-1.amazonaws.com@SOLRS.NET"




sqoop import --connect jdbc:mysql://52.207.2.108/northwind --username temp --password temp --table EmployeeTerritories --m 1 --delete-target-dir --target-dir /user/trisha/northwind/ --fields-terminated-by ','  


