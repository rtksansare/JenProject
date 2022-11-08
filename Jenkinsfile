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
        
        stage('consolidated results'){
            steps{
                input("Do you want to capture results?")
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'
            }
        }
    }
}
