pipeline {
    agent { any{ image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                bat 'echo hello'
                
            }
        }
    }
    
    post {
            always {
                junit 'build/reports/**/*.xml'
            }
        }
}
