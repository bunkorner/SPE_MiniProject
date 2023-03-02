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
        stage("DOCKER IMAGE BUILD")
        {
            steps
            {
                sh 'docker image build -t minicalculator:v1.$BUILD_ID .'
                sh 'docker image tag minicalculator:v1.$BUILD_ID gr/minicalculator:v1.$BUILD_ID'
                sh 'docker image tag minicalculator:v1.$BUILD_ID gr/minicalculator:latest'
            }
        }
        stage("DOCKER IMAGE PUSH")
        {
            steps
            {
                withCredentials([string(credentialsId: 'DockerPassword', variable: 'DockerCredentials')])
                {
                    sh 'docker login -u bunkorner -p ${DockerCredentials}'
                    sh 'docker image push gr/minicalculator:v1.$BUILD_ID'
                    sh 'docker image push gr/minicalculator:latest'
                }
            }
        }
    }
}