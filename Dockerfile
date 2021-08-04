FROM java:8-jdk-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} dockerizeappapplication.jar

ENTRYPOINT ["java","-jar","/dockerizeappapplication.jar"]