FROM openjdk:8-jdk-alpine

MAINTAINER Laijin Lu <1@aikin.me>

COPY build/libs/spring-boot-microservice-seed.jar /app/spring-boot-microservice-seed.jar

WORKDIR /app

CMD ["java", "-jar", "-Xmx2048m", "spring-boot-microservice-seed.jar"]
