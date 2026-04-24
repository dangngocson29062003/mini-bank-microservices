#Start with a base image containing Java runtime
FROM openjdk:17-ea-17-jdk-slim

#Information around who maintains the image
MAINTAINER sondang

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]