FROM maven:3.9.1-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
COPY --from=build /target/weatherstation-0.0.1-SNAPSHOT.jar weatherstation.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","weatherstation.jar"]
