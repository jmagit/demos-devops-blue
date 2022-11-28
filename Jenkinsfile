pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh 'sh "mvn compile"'
      }
    }

    stage('Test') {
      steps {
        sh 'sh "mvn test"'
        junit 'target/surefire-reports/*.xml'
      }
    }

  }
}