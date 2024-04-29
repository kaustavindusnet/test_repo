FROM openjdk:17-jdk-slim
EXPOSE 8082


# COPY pom.xml target/lib* /opt/lib/
COPY ./target/*.jar  /opt/demoapp.jar
WORKDIR /opt


CMD ["java", "-jar", "demoapp.jar"]