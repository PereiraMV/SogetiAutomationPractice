

# SogetiAutomationPractice <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Sogeti-logo-2018.svg/1200px-Sogeti-logo-2018.svg.png" alt="sogeti logo" width="200" align="right"/>

1. Ce projet a été réalisé durant une formation d'automaticien de tests par Marc-Vincent,Yacine et Zahia (Contributeurs du projet) et encadré par Luis et Zyed.
1. Le but final étant d'effectuer une présentation du projet réalisé et de la stratégie de test adopté en fonction du temps alloué au projet pour tester le site web : http://automationpractice.com/index.php.
1. Nous avons fonctionné de manière agile(scrum), le backlog du projet ainsi que les sprints sont maintenus sur Jira, chaque contributeur est un membre de l'équipe tandis que les encadrant sont les Product Owners.
1. Nous avons utilisé Jira, Java avec Selenium webdriver et TESTNG, Github et Jenkins pour l'intégration continue.

## Architecture
Deux dossiers dans le src/ sont importants dans le projet:
1. main : contient toutes les classes définies de notre projet, nous avons travaillé avec une architecture Page Object (POM).
1. test : Les scripts des différents tests que nous avons choisi d'automatisé

Les tests sont éxecutés au moins 5 fois avant de les déclarés comme échoués ( pour palier au erreurs dû à l'environnement), une modification la classe RetryAnalyzer permet de changer ce comportement.
<br>
Toutes les classes Page Object héritent de la classe CommonClass ou sont défini les fonctions accessible depuis toutes les pages du site.
<br>
Tout les scripts de Test héritent d'une même classe CommonTestClass ou sont défini les comportement avant et après l'éxécution des tests.

## Installation

### Pré-requis

Les installations necessaires pour ce projet sont:
1. Java (jdk 11 ou plus)
2. selenium webdriver pour java
3. Chrome Webdriver
4. Git Bash (pour plus de facilité sous Windows)
5. Le plugIn HTML publisher est necessaire pour Jenkins

### Execution

Une fois les installations faites le projet peut être cloné avec :

 ```bash
git clone https://github.com/PereiraMV/SogetiAutomationPractice.git
```
puis on peut executer les tests avec:
```bash
./gradlew clean test
```
ou les lignes suivantes si l'on veut executer les tests en fonction des USs auquelles ils correspondent

```bash
./gradlew clean test --tests TestUS2
./gradlew clean test --tests TestUS4
./gradlew clean test --tests TestUS6
```
### Jenkins

Un fichier JenkinsFile est présent si on souhaite executer le projet sous Jenkins, Toutefois un paramètre est necessaire pour l'execution, ce paramètre doit avoir une valeur suivant:
1. TestUS2
1. TestUS4
1. TestUS6

En fonction des tests que l'on souhaite executer.
<br>
Un rapport est produit pour l'execution des tests sous Jenkins et permet de comprendre les tests qui ont réussi/échoué.
