FROM openjdk:17
EXPOSE 8080
ADD target/inventory-service-docker.jar inventory-service-docker.jar
ENTRYPOINT ["java","-jar","/inventory-service-docker.jar"]
