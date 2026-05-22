FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/core-api-1.0.0-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]