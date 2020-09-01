FROM openjdk:8-jdk-alpine

COPY target/eligibility2-0.0.1-SNAPSHOT.jar  /eligibility2-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eligibility2-0.0.1-SNAPSHOT.jar"]
