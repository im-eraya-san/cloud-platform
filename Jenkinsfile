@Library('library') _

// Define cfg variable
def cfg

// files and sub dir location
def files = ['namespace.yaml', 'quota.yaml', 'secrets/secrets.yml', 'configmap/configMap.yaml', 'pods/db.yaml']

pipeline {

//  Get any available build agent
    agent any

    stages {
//  Initializing environment variables
        stage("Init Env") {
            steps{
                // Loading manifest file location
                script{
                    // variable that will hold the value
                    // calling k8sEnv.groovy script
                    cfg = k8sEnv.location()
                }
            }
        }

// Get the cluster status k8s
        stage('k8s cluster status') {
            steps {
                script {
                    // call kubectl.groovy file to call k8s api
                    kubectl("get nodes")
                    kubectl("get ns")
                }
            }
        }
// Creating Namespace
        stage('Namespace') {
            steps{
                script {
                    for (f in files){
                        echo "calling file: ${f}"
                        kubectl("apply -f ${cfg.CONFIG_LOCATION}/${f}")
                    }
                }
            }
        }
    }
}
