# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
EXPOSE 4567
COPY target/example-service-*.jar /app.jar
# run application with this command line
CMD ["/usr/bin/java", "-jar", "/app.jar"]