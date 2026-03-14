FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY build/libs/flights-hello-world-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
