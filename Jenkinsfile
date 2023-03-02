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
        stage("DOCKER BUILD")
        {
            steps
            {
                sh 'docker image build -t $JOB_NAME:v1.$BUILD_ID .'
                sh 'docker image tag $JOB_NAME:v1.$BUILD_ID gr/$JOB_NAME:v1.$BUILD_ID'
                sh 'docker image tag $JOB_NAME:v1.$BUILD_ID gr/$JOB_NAME:latest'
            }
        }
    }
}