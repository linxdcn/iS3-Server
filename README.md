# iS3-Server

## Configuration

1. Change `dev` of `spring.profiles.active=dev` in `src/main/resources/application.properties` file to the profile you want. Typically you can choose `dev`, `test` and `prod`
2. Create files `application-dev.properties` and `application-prod.properties` referring to `application-test.properties`
## How to run
    mvn clean
    mvn install
    mvn spring-boot:run