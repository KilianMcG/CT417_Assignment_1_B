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
                sh 'chmod +x CT417_Assignment_1_B/gradlew'
                sh './CT417_Assignment_1_B/gradlew clean build'
            }
        }
    }
    
    
}
