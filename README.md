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

Use the following commands to insert each table into the mysql database ensure you are in ./Lab-2-backend/lib directory
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

Now you may runfrontend and retrieve data via the Queries 1.1-1.5, 2.1-2.3.

Query 1.1)
    Note: The user can enter the Title Name or the beginning word/words of the Publication Title they are looking for.
    The program will return the first publication that is a match to what the user has input, whether it be just part
    of the title or the entire title. As noted in the Lab 2 Notes, it is important to allow flexibility to user and not
    require user to 100% follow our terms. This approach accounts for these circumstances.
Query 1.2)
    Note: If no publication data is found from user input, the table at bottom of screen will remain blank.
Query 1.3)
    Note: If no publication data is found from user input, the table at bottom of screen will remain blank.
Query 1.4)
    Note: Values of Table are displayed upon selecting submit. This query may take some time to process.
Query 1.5)
    Note: If no publication data is found from user input, the table at bottom of screen will remain blank.
Query 2.1)
    Note: If no publication data is found from user input, the table at bottom of screen will remain blank.
Query 2.2)
    Note: Values of Table are displayed upon selecting submit. This query may take some time to process.
Query 2.3)
    Note: If no values are input, or if values are input that do not represent a valid value, the map will be
    displayed but no tags will be presented on the map. SCC only hosted conferences between 2004-2020, so it will not
    return tags if user submits 2003-2020. ICWS hosted conferences between 2003-2020, so tags on map will be return for
    all intervals between these years.


