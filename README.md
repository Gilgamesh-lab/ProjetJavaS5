# ProjetJavaS5

#  Indications pour lancer l'application

Executer ce script SQL pour créer la base de données avec les tables et des insert pour avoir un jeu de données initial

-- Création de la base de données
CREATE DATABASE IF NOT EXISTS projet_programmeur;
USE projet_programmeur;

-- Table PROGRAMMEUR

CREATE TABLE `programmeur` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NOM` varchar(25) DEFAULT NULL,
  `PRENOM` varchar(25) DEFAULT NULL,
  `ADRESSE` varchar(50) DEFAULT NULL,
  `PSEUDO` varchar(10) DEFAULT NULL,
  `RESPONSABLE` varchar(25) DEFAULT NULL,
  `HOBBY` varchar(15) DEFAULT NULL,
  `NAISSANCE` int DEFAULT NULL,
  `salaire` double DEFAULT NULL,
  `prime` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
)

-- Table PROJET

CREATE TABLE `projet` (
  `id` int NOT NULL AUTO_INCREMENT,
  `intitule` varchar(100) NOT NULL,
  `date_debut` date NOT NULL,
  `date_fin_prevue` date DEFAULT NULL,
  `etat` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
)

-- Table TRAVAILLE_SUR

CREATE TABLE `travaille_sur` (
  `id_programmeur` int NOT NULL,
  `id_projet` int NOT NULL,
  PRIMARY KEY (`id_programmeur`,`id_projet`),
  KEY `fk_projet` (`id_projet`),
  CONSTRAINT `fk_programmeur` FOREIGN KEY (`id_programmeur`) REFERENCES `programmeur` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `fk_projet` FOREIGN KEY (`id_projet`) REFERENCES `projet` (`id`) ON DELETE CASCADE
)

-- INSERT PROGRAMMEUR

INSERT INTO programmeur 
(NOM, PRENOM, ADRESSE, PSEUDO, RESPONSABLE, HOBBY, NAISSANCE, SALAIRE, PRIME)
VALUES
('Dupont', 'Jean', 'Paris', 'jdupont', 'Martin', 'Gaming', 1998, 2500.00, 300.00),
('Durand', 'Alice', 'Lyon', 'adurand', 'Martin', 'Lecture', 2000, 2700.00, 400.00),
('Bernard', 'Lucas', 'Marseille', 'lbernard', 'Paul', 'Sport', 1997, 2600.00, 350.00);

-- INSERT PROJET

INSERT INTO projet
(INTITULE, DATE_DEBUT, DATE_FIN_PREVUE, ETAT)
VALUES
('Application de gestion', '2024-01-10', '2024-06-30', 'En cours'),
('Site e-commerce', '2023-09-01', '2024-02-15', 'Terminé'),
('Outil interne RH', '2024-03-01', '2024-09-01', 'En cours');


-- INSERT TRAVAILLE_SUR

INSERT INTO travaille_sur
(ID_PROGRAMMEUR, ID_PROJET)
VALUES
(1, 1),  -- Jean Dupont travaille sur Application de gestion
(2, 1),  -- Alice Durand travaille sur Application de gestion
(3, 2);  -- Lucas Bernard travaille sur Site e-commerce


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

