FROM openjdk:10-jre-slim
COPY ./target/application-0.0.1.jar /usr/src/docker/
WORKDIR /usr/src/docker
EXPOSE 8080
CMD ["java", "-jar", "application-0.0.1.jar"]