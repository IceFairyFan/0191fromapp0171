FROM openjdk:11-jdk
COPY target/pos-application-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
