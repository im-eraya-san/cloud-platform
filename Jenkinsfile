@Library('library') _
pipeline {
    agent any

    stages {
        
        stage('Get Nodes') {
            steps {

                def cfg = k8sEnv()
                echo cfg.CONFIG_LOCATION

                script {
                    kubectl('get nodes')
                }
            }
        }

        
    }
}
