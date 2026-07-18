@Library('library')
pipeline {
    agent any

    stages {

        stage('Get Nodes') {
            steps {
                script {
                    kube('get nodes')
                }
            }
        }
    }
}
