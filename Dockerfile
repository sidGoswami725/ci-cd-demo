# Use the Eclipse Temurin image (The modern standard for Java)
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY . .

# Compile the code inside the container
RUN javac Calculator.java

# Set the command to run the calculator
ENTRYPOINT ["java", "Calculator"]
