# Use an official OpenJDK 17 runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the JAVA_HOME environment variable
ENV JAVA_HOME=/opt/java/openjdk

# Set the working directory
WORKDIR /app

# Copy the project JAR file into the container at /app
COPY target/study.project-0.0.1-SNAPSHOT.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]