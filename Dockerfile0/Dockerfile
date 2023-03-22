# Image pulling
FROM ubuntu:23.04

# Author label
LABEL Author="andrea.guzzon@perigea.it"

# Update packages
RUN apt update && apt upgrade -y

# Set the working directory
WORKDIR /home

# Copy the shell script
COPY hello.sh . 

# Run the shell script
ENTRYPOINT [ "/bin/bash" ]
CMD [ "./hello.sh" ]