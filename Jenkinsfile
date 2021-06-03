//     properties([
//         parameters([
//             [$class: 'ChoiceParameter',
//                 choiceType: 'PT_SINGLE_SELECT',
//                 description: 'Select the Env Name from the Dropdown List',
//                 filterLength: 1,
//                 filterable: true,
//                 name: 'Env',
//                 randomName: 'choice-parameter-5631314439613978',
//                 script: [
//                     $class: 'GroovyScript',
//                     fallbackScript: [
//                         classpath: [],
//                         sandbox: false,
//                         script:
//                             'return[\'Could not get Env\']'
//                     ],
//                     script: [
//                         classpath: [],
//                         sandbox: false,
//                         script:
//                             'return["2","4","6"]'
//                     ]
//                 ]
//             ]
//         ])
//     ])


pipeline {
    agent any

    parameters {
      string(name: 'testClass', defaultValue: params.testClass ?:'TestUS2', description: 'User Story to test')
    }

    stages {
        stage('Execution rights') {
            steps {
                echo "Start Tests"
            }
        }
        stage('Test') {
            steps {

                bat "gradlew.bat clean test --tests ${params.testClass}"
                bat 'echo Fin du Test '



            }
        }
    }

}