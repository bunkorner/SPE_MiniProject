pipeline {
    agent any

    stages {
        stage("ANSIBLE - Central Server")
        {
            steps
            {
                sh 'ansible-playbook -i Inventory CServerPlaybook.yaml'
            }
        }
        stage("ANSIBLE - Deploy Server")
        {
            steps
            {
                sh 'ansible-playbook -i Inventory DeployPlaybook.yaml'
            }
        }
//        stage("MAVEN BUILD")
//        {
//            steps
//            {
//                sh 'mvn clean install'
//            }
//        }
//         stage("DOCKER IMAGE BUILD")
//         {
//             steps
//             {
//                 sh 'docker image build -t minicalculator:v1.$BUILD_ID .'
//                 sh 'docker image tag minicalculator:v1.$BUILD_ID bunkorner/minicalculator:v1.$BUILD_ID'
//                 sh 'docker image tag minicalculator:v1.$BUILD_ID bunkorner/minicalculator:latest'
//             }
//         }
//         stage("DOCKER IMAGE PUSH")
//         {
//             steps
//             {
//                 withCredentials([string(credentialsId: 'DockerPassword', variable: 'DockerCredentials')])
//                 {
//                     sh 'docker login -u bunkorner -p ${DockerCredentials}'
//                     sh 'docker image push bunkorner/minicalculator:v1.$BUILD_ID'
//                     sh 'docker image push bunkorner/minicalculator:latest'
//                 }
//             }
//         }
    }
}
