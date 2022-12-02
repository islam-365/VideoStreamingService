FROM openjdk:8
EXPOSE 8090
COPY  target/database_controller.jar database_controller.jar
ENTRYPOINT ["java","-jar","database_controller.jar"]