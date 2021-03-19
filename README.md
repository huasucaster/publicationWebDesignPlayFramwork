# publicationWebDesignPlayFramwork
ReadMe Instructions for running:

In the .zip file, there are two projects, backend and frontend, these must be open separately in IntelliJ.
If the project does not have the configuration set, select add configuration, add Play 2 App, insert the URL to open,
backend will be: http://localhost:9005, frontend will be: http://localhost:9001.

Once the configuration is added, the backend should be run. Before running the backend, ensure that the
application.conf file is properly setup in the Conf folder. Make sure these values are filled with proper information,
In the URL replace "test" with your DB name, and username, and password with your values.

db.default.url="jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
db.default.username=root
db.default.password=root

Now you can proceed with running the backend, this will create the tables in the database.
When asked in browser, the user should apply the script. Before continuing you must complete the mysqldump in order
to populate your mysql database with the necessary values and structure. We have included mysqldump files in
Lab-2-backend lib folder. There are three mysqldump files: auth_info.sql, conference_data.sql, and pub_info.sql.

Use the following commands to insert each table into the mysql database ensure you are in ./backend/lib directory
in terminal before running following commands.

1. Open terminal, if it shows when inserting mysql command: "mysql: command not found"
   you must define the path before proceeding:
    -Windows insert command:
        //
        set path=C:\Program Files\MySQL\MySQL Server 8.0\bin
        //
        -the path will be unique to your system, use the path where MySQL executable is stored on your device.
    -Mac insert command:
        //
        $vi ~/.bash_profile
        //
    -Add three line code:
        //
        #mysql
        PATH=$PATH:/usr/local/mysql/bin
        export
        //
        -the path will be unique to your system, use the path where MySQL executable is stored on your device.
    -Save this and input command:
        //
        $source ~/.bash_profile
        //

Now you are ready to insert the data from the mysqldump provided into mysql database.
    1. Input command: mysql -h localhost -uroot -p -D DatabaseName <./pub_info.sql
    2. Input command: mysql -h localhost -uroot -p -D DatabaseName <./auth_info.sql
    3. Input command: mysql -h localhost -uroot -p -D DatabaseName <./conference_data.sql

    Note: DatabaseName should be replaced by the name of the database you have active that you want to insert the data
    into. You will be asked to enter the password associated with the root user as well.

Once this is completed the database will be filled with appropriate data necessary for the program to function.
