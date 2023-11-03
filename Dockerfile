FROM openjdk:17
ADD target/d387-maven-docker-project.jar d387-maven-docker-project.jar
ENTRYPOINT ["java", "-jar","d387-maven-docker-project.jar"]
EXPOSE 8080