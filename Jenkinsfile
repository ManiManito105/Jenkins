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
                    def app = docker.build("172.31.10.62:5000/proyecto-gradle:latest", "--build-arg JAR_FILE=build/libs/*.jar .")
                    docker.withRegistry("http://172.31.10.62:5000", "registry-credentials-id") {
                        app.push()
                    }
                }
            }
        }
    }
}
