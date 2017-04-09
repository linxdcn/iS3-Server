# iS3-Server

You can find the project from: https://github.com/linxdcn/iS3-Server

#### Prerequisites

- Java 8
- Maven > 3.0

#### Configurations

- Change profile in `src/main/resources/application.properties`
- Create files `application-dev.properties` or `application-prod.properties`
- Set your own configurations.

#### Run and build

Go on the project's root folder, then type:

    $ mvn clean
    $ mvn install
    $ mvn spring-boot:run