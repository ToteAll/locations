FROM alpine/java:21

COPY ./build/libs/locations-0.0.1-SNAPSHOT.jar application.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/application.jar"]