pipeline {
    agent any

    stages {
        stage('Execution rights') {
            steps {
                bat 'echo Debut des Test'
            }
        }
        stage('Test') {
            steps {
                bat 'echo Test User Connexion'
                bat 'gradlew.bat clean test --tests "TestUS2.UserConnexion"'
                bat 'echo Fin du Test User Connexion'
            }
        }
    }

}