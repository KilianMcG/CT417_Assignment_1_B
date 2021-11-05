pipeline {
    //agent { any{ image 'maven:3.3.3' } }
    agent any
    stages {
        stage('build') {
            steps {
                //bat 'icacls gradlew /grant Users:F'
                //bat 'gradlew check'
                //bat 'echo hello'
                //bat 'gradle assemble'
                //bat 'start gradlew check'
                //gradlew check
                sh 'chmod +x gradlew'
                sh './gradlew clean build'
            }
        }
    }
    
    
}
