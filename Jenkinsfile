pipeline{
    agent any
    
    environment {
        NameSpace='lzfolder'
        WebServer='172.31.12.139'
        port='8100'
    }
    
    stages{
        stage('git'){
            steps{
                step([$class: 'WsCleanup'])
                git poll: true, branch: "master", url: 'https://github.com/Dorom123/spring-boot-basic.git'
            }
        }
        stage('Sonar'){
            steps{
                sh './gradlew sonarQube'
            }
        }
        
        stage('Test'){
            steps{
                sh './gradlew test'
            }
        }
        
        stage('build'){
            steps{
                sh './gradlew build'
            }
        }
        
        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
        
    }
    
    
}