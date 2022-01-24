# Spring custom auth

This projects is strictly for educational purposes and was used to create a custom authentication system that relays on custom registration form, password hashing and Spring provided Login form.


To recreate the project in your environment run the follow these steps:

1. Open MySQL Workbench and open the script "sql/db-init.sql"
2. Change these parameters in the application.properties files to your username and password, if you are using the datasource url on the same port as I do you can live it as it is in the properties

```properties

    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/auth?useSSL=false&serverTimezone=UTC
    spring.datasource.username=yourUsername
    spring.datasource.password=yourPassword

```

3. Run DemoApplication.java
