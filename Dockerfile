FROM openjdk:17-jdk

COPY target/patients-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "patients-0.0.1-SNAPSHOT.jar"]