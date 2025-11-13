FROM eclipse-temurin:8-jdk
EXPOSE 8085
ADD target/cicd-with-docker.jar cicd-with-docker.jar
ENTRYPOINT ["java","-jar","/cicd-with-docker.jar"]