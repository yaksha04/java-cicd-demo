pipeline {
    agent any
    tools {
        maven 'Maven 3.8.7' // Ensure this matches your Jenkins Global Tool Configuration
        jdk 'JDK17'         // Ensure this matches your Jenkins Global Tool Configuration
    }
    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/yaksha04/java-cicd-demo.git'
            }
        }
        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t myapp:1.0 .'
            }
        }
        stage('Run Docker Container') {
            steps {
                sh 'docker run -d -p 8080:8080 myapp:1.0'
            }
        }
    }
}
