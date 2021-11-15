To setup the example app's database, we will use hsqldb (file based). 
Alternatively you may connect to any database you want and would need to change some files and properties. 


to use HSQLDB
1. download HSQLDB from https://sourceforge.net/projects/hsqldb/files/latest/download and unzip it to a folder
> cd /your-project-dir/bahmni-feed-integration-example/
> mkdir db
> cp /download-location/hsqldb-2.6.1.zip db/
> cd db/
> unzip hsqldb-2.6.1.zip
> cd hsqldb-2.6.1/hsqldb/data
> java -cp ../lib/hsqldb-jdk8.jar org.hsqldb.server.Server --database.0 file:testdb --dbname.0 xdb

2. Once you have done the above, in the scripts/db directory you should have 

> java -cp ../lib/hsqldb-jdk8.jar org.hsqldb.util.DatabaseManager
>  