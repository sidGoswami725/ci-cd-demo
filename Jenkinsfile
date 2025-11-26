pipeline {
    agent any
    
    environment {
        // REPLACE THIS with your DockerHub username
        DOCKER_IMAGE = "sidgoswami725/rollno-542-calc"
        DOCKER_TAG = "latest"
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building the code...'
                // Compiles the Java files. 
                // Jenkins needs "javac" in its PATH.
                bat 'javac Calculator.java TestCalculator.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing the code...'
                // Runs the TestCalculator. If it fails, the pipeline stops here.
                bat 'java TestCalculator'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Tests passed! Building Docker Image...'
                // Builds the image using the Dockerfile
                bat "docker build -t %DOCKER_IMAGE%:%DOCKER_TAG% ."
            }
        }

        stage('Docker Push') {
            steps {
                echo 'Pushing to Docker Hub...'
                // Uses the credentials ID 'dockerhub-creds' you created in Jenkins
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
                    bat "echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin"
                    bat "docker push %DOCKER_IMAGE%:%DOCKER_TAG%"
                }
            }
        }
    }

}
