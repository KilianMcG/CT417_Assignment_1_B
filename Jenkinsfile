pipeline {
    agent { any{ image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                //bat 'gradlew check'
                //bat 'echo hello'
                //gradle assemble
                bar 'start gradlew check'
            }
        }
    }
    
    post {
            always {
                junit 'build/reports/**/*.xml'
            }
        }
}
