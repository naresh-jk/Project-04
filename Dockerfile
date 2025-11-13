FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
ADD target/cicd-demo-app-1.0.0-SNAPSHOT.jar cicd-with-docker.jar
ENTRYPOINT ["java","-jar","/cicd-with-docker.jar"]