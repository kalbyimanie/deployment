node('jenkins-slave'){
  stage('Checkout scm'){
    checkout scm
  }
  stage('Spawn shell program') {
    sh 'echo hello world'
  }
}