pipeline{

 agent any

  stages{
    stage('Build'){
      steps{
        echo 'Hello World BUILD'
        mvn clean install -DskipTests
      }
    }

    stage('Test'){
      steps{
        echo 'Hello World TEST'
      }
    }

    stage('Deploy'){
      steps{
        echo 'Hello World DEPLOY'
      }
    }


  }
}