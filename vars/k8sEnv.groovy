def location(){
    return [ 
        CONFIG_LOCATION: 'k8s/manifests',
        FILE_LOCATION: [
            'namespace.yaml', 
            'quota.yaml', 
            'secrets/secrets.yml', 
            'configmap/configMap.yaml', 
            'pods/db.yaml'
        ]
    ]
}