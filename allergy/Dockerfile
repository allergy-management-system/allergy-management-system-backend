FROM maven:3.8.1-openjdk-17 AS BUILD
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-slim
COPY --from=BUILD /target/allergy-0.0.1-SNAPSHOT.jar allergy.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "allergy.jar"]


