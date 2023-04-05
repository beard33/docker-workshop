# Image pulling
FROM amazoncorretto:11-alpine-jdk
# Author label
LABEL Author="andrea.guzzon@perigea.it"

# Set the working directory
WORKDIR /home

EXPOSE 8080

# Copy the shell script
COPY ./docker-demo/target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo.jar

# Run the shell script
ENTRYPOINT [ "java", "-jar", "./docker-demo.jar" ]