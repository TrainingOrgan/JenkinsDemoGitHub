pipeline {
	agent any
	
	environment{
        JENKINS_NODE_COOKIE = 'dontkillmeplease'
        TRAINING_PORT=9025
    }
	
	stages {
		stage ("Its morphin time!") {
			echo 'sabertooth tiger!'
		}
		stage('Clean') {
            steps {
              cleanWs()
            }
        }
        stage ("Build my project, mane") {
			echo 'Building right now, fam'
			cd HelloWorld
			withGradle(){
				sh './gradlew build'
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
				cd 
                script {
                     sh 'nohup java -jar HelloWorld-1.0-SNAPSHOT.jar &'
                }
            }
        }
	}
}