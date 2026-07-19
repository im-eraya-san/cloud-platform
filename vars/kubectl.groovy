def call(String command) {
    withCredentials([
        
        file(credentialsId: 'KUBE-CONFIG', variable: 'KUBECONFIG'),
        string(credentialsId: 'KSERVER', variable: 'ENDPOINT')
    ]) {
        
        sh "kubectl --server=${ENDPOINT} --kubeconfig=${KUBECONFIG} ${command}"
    }
}
