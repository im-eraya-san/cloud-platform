@Library('library') _
pipeline {
    agent any

    stages {
        
        stage('Get Nodes') {
            steps {
                script {
                    def cfg = k8sEnv.location()
                    echo cfg.CONFIG_LOCATION
            
                    kubectl('get nodes')
                }
            }
        }

        
    }
}
