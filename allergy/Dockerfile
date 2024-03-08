FROM maven:3.8.1-openjdk-17 AS BUILD
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-slim
COPY --from=BUILD /target/allergy-0.0.1-SNAPSHOT.jar allergy.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "allergy.jar"]

#Mount a vloume to host the directory containing the key file:
#use the -v flag to mount the host directory with the key file to the container's /secrets/google directory
#set the gcloud Environment Variable
VOLUME /secrets/google
RUN -v /allergy-management-system-backend/graphic-theory-415406-88c5750d8934.json:/secrets/google gcloudservicekey
ENV GOOGLE_APPLICATION_CREDENTIALS=/secrets/google/graphic-theory-415406-88c5750d8934.json

