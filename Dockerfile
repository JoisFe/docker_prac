FROM openjdk:11-jdk

WORKDIR /app

COPY gradle gradle
COPY gradlew .

RUN ./gradlew --no-daemon --version
COPY build.gradle .
COPY settings.gradle .
RUN ./gradlew --no-daemon clean build

COPY src src

COPY ./joisfe.jar .

EXPOSE 8080

CMD ["java", "-jar", "joisfe.jar"]
