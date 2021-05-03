FROM maven:3.8-jdk-11 as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build a release artifact.
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:11-jre-slim
COPY --from=build /target/covid-help-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]
