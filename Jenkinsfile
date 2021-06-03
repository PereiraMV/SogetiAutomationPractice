pipeline {
    agent any

    stages {
        stage('Execution rights') {
            steps {
            }
        }
        stage('Test') {
            steps {
                bat 'gradlew.bat clean test --tests "TestUS2.UserConnexion"'
                bat 'echo Fin du Test User Connexion'

                bat 'gradlew.bat clean test --tests "TestUS2.UserConnexionWrongPwd"'
                bat 'echo Fin du Test User Connexion'


            }
        }
    }

}