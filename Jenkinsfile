pipeline {
    agent { any{ image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                bat 'gradle assemble'
            }
        }
    }
}