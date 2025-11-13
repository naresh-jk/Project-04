FROM openjdk:8
EXPOSE 8080
ADD target/cicd-demo-app-1.0.0-SNAPSHOT.jar cicd-with-docker.jar
ENTRYPOINT ["java","-jar","/cicd-with-docker.jar"]