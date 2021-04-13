pipeline {
	agent any
	
	tools {
		
	}
	
	stages {
		stage ("Run my project, mane") {
			echo 'sabertooth tiger!'
			cd 
			withGradle(){
				sh './gradlew build'
			}
		}
		stage ("Its morphin time!") {
			echo 'sabertooth tiger!'
		}
	}
}