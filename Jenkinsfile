    properties([
        parameters([
            [$class: 'ChoiceParameter',
                choiceType: 'PT_SINGLE_SELECT',
                description: 'Select the Env Name from the Dropdown List',
                filterLength: 1,
                filterable: true,
                name: 'Env',
                randomName: 'choice-parameter-5631314439613978',
                script: [
                    $class: 'GroovyScript',
                    fallbackScript: [
                        classpath: [],
                        sandbox: false,
                        script:
                            'return[\'Could not get Env\']'
                    ],
                    script: [
                        classpath: [],
                        sandbox: false,
                        script:
                            'return["2","4","6"]'
                    ]
                ]
            ]
        ])
    ])


pipeline {
    agent any
    stages {
        stage('Execution rights') {
            steps {

                echo "${params.Env}"
            }
        }
        stage('Test') {
            steps {
                bat "gradlew.bat clean test --tests 'TestUS${params.Env}.UserConnexion'"
                bat 'echo Fin du Test User Connexion'



            }
        }
    }

}