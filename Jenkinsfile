@Library('library') _

pipeline {

//  Get any available build agent
    agent any

    stages {
//  Initializing environment variables
        stage("Init Env") {
            steps(){
                // Loading manifest file location
                script{
                    // variable that will hold the value
                    // calling k8sEnv.groovy script
                    cfg = k8sEnv()
                }
            }
        }

// Get the cluster status k8s
        stage('k8s cluster status') {
            steps {
                script {
                    // call kubectl.groovy file to call k8s api
                    kubectl('get nodes')
                    kubectl('get ns')
                }
            }
        }
// Creating Namespace
        stage('Namespace') {
            steps {
                script {
                    kubectl('apply -f ${cfg.CONFIG_LOCATION}/namespace.yaml')
                }
            }
        }
    }
}
