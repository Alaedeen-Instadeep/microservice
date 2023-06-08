# Use a base image with Java 8 or later installed
FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/BankingMicroService-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Set the entrypoint command to run the application
CMD ["java", "-jar", "app.jar"]
