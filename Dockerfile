FROM openjdk:17-jdk-slim

WORKDIR /app

ENTRYPOINT ["java", "-jar", "eBanking-0.0.1-SNAPSHOT.jar"]