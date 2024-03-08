FROM maven:3.8.1-openjdk-17 AS BUILD
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-slim
COPY --from=BUILD /target/allergy-0.0.1-SNAPSHOT.jar allergy.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "allergy.jar"]

#Let's work on the gcloud file credentials environment:
# Set the working directory
WORKDIR /app

# Copy the service account key file into the Docker image
COPY allergy-management-system-backend/allergy/allergy-management-service-8d8002cbf7fe.json /app/service-account-key.json

# Set the environment variable
ENV GOOGLE_APPLICATION_CREDENTIALS=/app/service-account-key.json
