pipeline {
    agent {
        node {
            label 'maven'
        }
    }
environment {
    
    PATH = "/opt/apache-maven-3.9.4/bin:$PATH"
}
    stages {
	stage ('Git Checkout') {
  steps {
      git 'https://github.com/adityanaidu20690/pawanapp.git'
     }
}
stage('maven') {
            steps {
                echo "---------build started-------------"
                sh 'mvn clean deploy -Dmaven.test.skip=true'
                echo "---------build completed-------------"
            }
        }
        stage('test') {
            steps {
                echo "---------unit test started-------------"
                sh 'mvn surefire-report:report'
                echo "---------unit test completed-------------"
            }
        }
}
}
