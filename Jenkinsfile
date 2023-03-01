pipeline {
    agent any

    stages {
        stage("MAVEN BUILD")
        {
            steps
            {
                sh 'mvn clean install'
            }
        }
    }
}