FROM openjdk:8
EXPOSE 8080
ADD target/cicd-with-docker.jar cicd-with-docker.jar
ENTRYPOINT ["java","-jar","/cicd-with-docker.jar"]