pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
        sh 'mvn compile'
      }
    }

    stage('test') {
      steps {
        sh 'mvn test'
        junit 'target/surefire-reports/*.xml'
      }
    }

    stage('Empaquete') {
      steps {
        sh 'mvn package -DskipTests'
      }
    }

  }
}