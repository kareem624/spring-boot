FROM openjdk:8-jdk-alpine
COPY target/demo-aws.jar demo-aws.jar
ENTRYPOINT ["java","-jar","/demo-aws.jar"]