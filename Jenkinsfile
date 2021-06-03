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
String executionTestString = ""

switch(params.Env){
    case "2":
    executionTestString = "TestUS"+params.Env+".UserConnexion TestUS"+params.Env+".UserConnexionWrongPwd"
    case "4":
    executionTestString = "TestUS"+params.Env+".SearchArticle TestUS"+params.Env+".SearchByAutoCompleteArticle"
    case "6":
    executionTestString = "TestUS"+params.Env+".verificationUserAdress TestUS"+params.Env+".modificationAdress TestUS"+params.Env+".createAdress"
    default:
    executionTestString = ""

}

pipeline {
    agent any
    stages {
        stage('Execution rights') {
            steps {

                echo "${params.Env}"
                echo "${executionTest}"
            }
        }
        stage('Test') {
            steps {

                bat 'gradlew.bat clean test --tests '+executionTest
                bat 'echo Fin du Test User Connexion'



            }
        }
    }

}