# Stage 1: Build the application
FROM maven:3.8.1-openjdk-17 AS BUILD
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create the final image
FROM openjdk:17.0.1-slim
WORKDIR /app
COPY --from=BUILD /app/target/allergy-0.0.1-SNAPSHOT.jar allergy.jar
#COPY service.json /app/service-account-key.json
#ENV GOOGLE_APPLICATION_CREDENTIALS=/app/service-account-key.json
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "allergy.jar"]
