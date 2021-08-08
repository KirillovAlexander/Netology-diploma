FROM openjdk:16-alpine

EXPOSE 8080

ADD target/Cloud-0.0.1-SNAPSHOT.jar CloudApp.jar

ENTRYPOINT ["java","-jar","/CloudApp.jar"]