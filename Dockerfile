FROM openjdk:11
EXPOSE 9090
ADD target/DevOps-0.0.1-SNAPSHOT.jar DevOps-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DevOps-0.0.1-SNAPSHOT.jar"]
