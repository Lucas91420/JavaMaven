#  Documentation de l’environnement de développement JavaFX avec Maven

Ce projet met en place un environnement de développement **Node.js / React** conforme à des bonnes pratiques professionnelles 


mvn clean	Supprime les fichiers générés
mvn install	Installe le projet localement
mvn exec:java	Exécute l’application
mvn test	Exécute les tests unitaires
mvn jacoco:report	Génère le rapport de couverture des tests
mvn checkstyle:check	Vérifie la conformité du code
mvn package	Génère un JAR exécutable
java -jar target/EnvJava-1.0-SNAPSHOT-shaded.jar	Exécute l’application depuis un JAR

## 1. Prérequis

Avant de commencer, assurez-vous d'avoir les outils suivants installés :

✔ **Java JDK 23+**  
✔ **Maven 3.9+**  
✔ **IntelliJ IDEA (Recommandé)**  

**Vérifier l’installation :**
```bash
java -version
mvn -version
```

## 2. Installation

```bash
git clone https://github.com/votre-repo/EnvJava.git
cd EnvJava
mvn clean install
```
### Exécution de l’application
##  Lancer JavaFX en mode développement
```bash
mvn clean package
```

## Exécuter l’application avec Java
```bash
java -jar target/EnvJava-1.0-SNAPSHOT-shaded.jar
```

### Tests unitaires
##  Exécuter tous les tests
  ```bash
 mvn test
 ```

 ## Générer un rapport de couverture des tests (JaCoCo)
 ```bash
mvn jacoco:report
 ```
Rapport généré dans target/site/jacoco/index.html

### Vérification du code avec Checkstyle
##  Lancer Checkstyle

 ```bash
mvn checkstyle:check
  ```

### Variables d'environnement (.env)
##  Ajouter .env dans .gitignore
 ```bash
.env
  ```
## Exemple de .env

 ```bash
DATABASE_URL=jdbc:mysql://localhost:3306/mydb
DATABASE_USER=root
DATABASE_PASSWORD=secret
  ```

## Structure du projet
 ```bash
EnvJava/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org.example/
│   │   │       ├── MainApp.java
│   │   │       ├── MainController.java
│   │   │       ├── App.java
│   │   │       ├── main-view.fxml
│── test/
│── pom.xml
│── README.md
│── .gitignore
│── .env
│── target/
  ```

## Licence 

Ce projet est distribué sous la licence **MIT**

## Support 

-   Ouvrez une **issue** sur GitHub si vous rencontrez un problème.
-   Contactez l’équipe de développement pour des questions spécifiques.
