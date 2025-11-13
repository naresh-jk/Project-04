FROM eclipse-temurin:8-jdk
EXPOSE 8085
ADD target/cicd-demo-app-1.0.0-SNAPSHOT.jar cicd-with-docker.jar
ENTRYPOINT ["java","-jar","/cicd-with-docker.jar"]