pipeline {
	agent any
	
	environment{
        JENKINS_NODE_COOKIE = 'dontkillmeplease'
        TRAINING_PORT=9025
    }
	
	stages {
		stage ("Its morphin time!") {
			steps{
				echo 'sabertooth tiger!'
			}
		}
		stage('Clean') {
            steps {
              cleanWs()
            }
        }
		stage('Checkout') {
           steps {
               git branch: 'master', credentialsId: '52aca62e-b649-4962-a874-db4182899ce8', url: 'https://github.com/tachester/JenkinsDemoGitHub.git'
           }
        }
        stage ("Build my project, mane") {
			steps{
				echo 'Building right now, fam'
				withGradle(){
					sh './HelloWorld/gradlew build'
				}
			}
		}
        stage('Destroy Old Server') {
            steps {
                script {
                    try {
                        // kill any running instances
                        sh 'kill $(lsof -t -i:$TRAINING_PORT)'
                    } catch (all) {
                        // if it fails that should mean a server wasn't already running
                        echo 'No server was already running'
                    }
                }
            }
        }
        stage('Start New Server!') {
            steps {
                script {
                     sh 'nohup java -jar ./HelloWorld/jarFolder/HelloWorld-1.0-SNAPSHOT.jar &'
                }
            }
        }
	}
}