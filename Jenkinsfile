pipeline {
    agent any 
    stages {
        stage('cleaning stage') { 
            steps {
            bat "mvn clean"
            }
        }
        stage('Test') { 
            steps {
                bat "mvn test"
            }
        }
        stage('packaging stage') { 
            steps {
                bat "mvn package"
            }
        }
    }
}
