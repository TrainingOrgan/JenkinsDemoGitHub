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
				script{
					try {
						sh "rm -r JenkinsDemoGitHub"
						echo 'Directory found, and deleted'
					} catch (all) {
						echo 'No directory exists'
					}
				}
				sh "git clone https://github.com/tachester/JenkinsDemoGitHub.git"
           }
        }
        stage ("Build my project, mane") {
			steps{
				echo 'Building right now, fam'
				sh "pwd"
				sh "ls"
				sh 'gradlew build'
			}
		}
        stage('Destroy Old Server') {
            steps {
                script {
                    try {
                        // kill any running instances
                        sh 'kill $(lsof -t -i:9025)'
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
                     sh 'nohup java -jar ./build/libs/JenkinsDemoProject-1.0-SNAPSHOT.jar &'
                }
            }
        }
	}
}