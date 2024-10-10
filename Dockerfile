FROM eclipse-temurin:21.0.4_7-jdk
WORKDIR /app
COPY target/dog-grooming-system-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
