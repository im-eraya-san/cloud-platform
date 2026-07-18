@Library('library') _
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
