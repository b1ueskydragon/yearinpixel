# yearinpixel
a year in pixel for me

## developed on
- java 1.8 ~ (will be upgraded)
- javax.servlet 3.1.0
- apache-tomcat-8.5.23
- Apache Maven 3.6.0
- mysql 5.7
- MacOS Mojave 10.14.2 (TODO: CentOS)

### mysql databases
- yearinpixel_db

### tomcat settings (sample, will be upgraded)
```.sh
$ vi ${HOME_DIR}/apache-tomcat-8.5.23/conf/Catalina/localhost/yearinpixel.xml
```
```yearinpixel.xml
<Context docBase="${HOME_DIR}/yearinpixel/target/yearinpixel"  reloadable="true">
        <Resource name="yearinpixelDB" type="javax.sql.DataSource"
        auth="Container" driverClassName="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost/yearinpixel_db?
        userUnicode=true&amp;charactorEncoding=UTF-8&amp;autoReconnect=true"
        username="${USERNAME}" password="${PASSWORD}" validationQuery="select CURRENT_TIMESTAMP" />
</Context>
```

`${HOSTNAME}` could be localhost if mysql is in local


### mysql dump (for manual operation on initial stage)

```.sh
# out
mysqldump -u ${USERNAME} -p -h ${HOSTNAME} yearinpixel_db > yearinpixel.dump

# in
mysqldump -u ${USERNAME} -p -h ${HOSTNAME} yearinpixel_db < yearinpixel.dump
```

