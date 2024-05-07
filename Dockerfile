FROM amazoncorretto:17.0.11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} management_service.jar

ENTRYPOINT ["java", "-jar", "/management_service.jar"]

EXPOSE 9505