# ProjetJavaS5

#  Indications pour lancer l'application

Récupérer le "src" et le "mysql-connector.jar" qui se trouve dans le dossier "projet_java".
Executer le script SQL qui se trouve dans le fichier "Script_SQL" pour créer la base de données "projet_programmeur" et les tables "programmeur", "projet" et "travaille_sur". Il y a des insert pour avoir un jeu de données initial si vous le souhaitez.<br>


<img width="1052" height="510" alt="image" src="https://github.com/user-attachments/assets/ca191196-cf5a-4c19-a595-1df7bf788fdd" />
Dans le fichier ActionsBDD, vous pouvez modifier vos identifiants ici pour se connecter à votre base de données depuis l'application.

# Choix du SGBD
Pour ce projet, nous avons utilisé MySQL comme système de gestion de base de données, avec MySQL Workbench. MySQL est un SGBD assez simple à prendre en main et très utilisé. Il est bien adapté à un projet scolaire, surtout pour gérer des tables liées entre elles. MySQL Workbench permet de créer facilement la base de données, les tables et de tester les requêtes SQL sans passer uniquement par la ligne de commande. On a aussi choisi MySQL Workbench car nous l'avons utilisé en tp et c'était simple d'utilisation avec une interface claire.
Il permet de gérer correctement les programmeurs, les projets et les relations entre eux. Les opérations classiques (ajout, suppression, modification, affichage) sont faciles à mettre en place.<br><br>  
Toutes les fonctionnalités demandées dans le cahier des charges ont pu être mises en œuvre dans le temps imparti.

# Fonctionnalités supplémentaires

En plus des fonctionnalités demandées, quelques fonctionnalités supplémentaires ont été ajoutées afin d’améliorer le fonctionnement de l’application et la gestion des données :
* ajouterProjet() : permet d’ajouter un nouveau projet en renseignant ses différents attributs (intitulé, dates, état).
* supprimerProjet() : permet de supprimer un projet à partir de son identifiant.
* associerProgrammeurProjet() : permet d’associer un programmeur à un projet grâce à leurs identifiants respectifs.
* retirerProgrammeurProjet() : permet de retirer un programmeur d’un projet grâce à leurs identifiants.

