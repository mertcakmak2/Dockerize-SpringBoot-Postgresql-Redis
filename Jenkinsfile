pipeline {
    agent any
    tools {
        maven '3.8.1'
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