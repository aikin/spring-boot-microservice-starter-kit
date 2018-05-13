FROM openjdk:8-jdk-alpine

MAINTAINER Laijin Lu <1@aikin.me>

COPY build/libs/spring-boot-best-seed.jar /app/spring-boot-best-seed.jar

WORKDIR /app

CMD ["java", "-jar", "-Xmx2048m", "spring-boot-best-seed.jar"]
