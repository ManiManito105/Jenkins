pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ManiManito105/Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Docker Build & Push') {
            steps {
                script {
                    docker.build("registry:5000/flights-hello-world:1.0")
                          .push()
                }
            }
        }
    }
}
