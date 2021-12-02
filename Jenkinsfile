pipeline {
    agent any
    tools {
        jdk 'jdk'
        maven '3.8.3'

    }
    stages {
        stage("build project") {
            steps {
                echo "Java VERSION"
                sh 'java -version'
                echo "Maven VERSION"
                sh 'mvn -version'
            }
        }
    }
}