# Use a standard Java image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY . .

# Compile the code inside the container
RUN javac Calculator.java

# Set the command to run the calculator
ENTRYPOINT ["java", "Calculator"]