FROM openjdk:8-jdk-alpine
COPY ./target/application-0.0.1.jar /usr/src/docker/
WORKDIR /usr/src/docker
EXPOSE 8080
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","application-0.0.1.jar"]