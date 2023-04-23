# Base image
FROM openjdk:11-jdk

# Set the working directory
WORKDIR /app

# Copy the Gradle wrapper files
COPY gradlew .
COPY gradle gradle

# Download the dependencies for caching
RUN ./gradlew --no-daemon --version

COPY build.gradle .
COPY settings.gradle .
COPY src src

# Build the application
RUN ./gradlew clean build

# Copy the application files to the container
COPY build/libs/joisfe.jar joisfe.jar

# Expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "joisfe.jar"]
