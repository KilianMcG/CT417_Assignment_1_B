pipeline {
    //agent { any{ image 'maven:3.3.3' } }
    agent any
    stages {
        stage('build') {
            steps {
                
                sh 'chmod +x gradlew'
                sh './gradlew clean build'
            }
        }
    }
    
    
}
