FROM maven:3.8.1-openjdk-17 AS BUILD
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-slim
COPY --from=BUILD /target/allergy-0.0.1-SNAPSHOT.jar allergy.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "allergy.jar"]

# Use a base image (e.g., one with Java already installed)
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the service account key file into the container
COPY graphic-theory-415406-88c5750d8934.json /secrets/google/

# Set the GOOGLE_APPLICATION_CREDENTIALS environment variable
ENV GOOGLE_APPLICATION_CREDENTIALS=/secrets/google/graphic-theory-415406-88c5750d8934.json


#VOLUME /secrets/google
#RUN -v /allergy-management-system-backend/graphic-theory-415406-88c5750d8934.json:/secrets/google gcloudservicekey
#ENV GOOGLE_APPLICATION_CREDENTIALS=/secrets/google/graphic-theory-415406-88c5750d8934.json

