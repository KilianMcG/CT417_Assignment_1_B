pipeline {
    agent { any{ image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                bat 'icalcs gradlew /grant Users:F'
                bat 'gradlew check'
                //bat 'echo hello'
                //bat 'gradle assemble'
                //bat 'start gradlew check'
                //gradlew check
            }
        }
    }
    
    
}
