FROM openjdk:8-jdk-alpine

COPY build/libs/spring-boot-best-seed.jar /app/spring-boot-best-seed.jar

WORKDIR /app

CMD ["java", "-jar", "spring-boot-best-seed.jar"]
