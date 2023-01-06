# projet_bonsi_richard
# Bienvenue sur le repo Github du mini projet du Semestre 1 de Master SID, par Valentin BONSI et Nathant RICHARD

## Description du projet
Ce projet a pour but de créer une application Android 100% hors-ligne, capable d'estimer le prix d'un bien immobilier situé dans la ville de Saint-Etienne-du-Rouvray, en Seine-Maritime(76) à partir des caractéristiques entrées par l'utilisateur dans les différents champs de l'application.

## Présentation du jeu de données utilisées pour l'application
Pour créer notre application, nous avons utilisé les données publiques de ventes issues du site [d'estimation immobilière du gouvernement](https://www.app.dvf.etalab.gouv.fr/). Ces données sont mises à jour chaque mois et contiennent les informations suivantes :
- Identifiant de la vente
- Identifiant de la commune
- Identifiant de la parcelle
- Identifiant de la voie
- Code postal
- Date de la vente
- Nature de la transaction
- Valeur foncière
- Nombre de lots
- Type de voie
- Code type de voie
- Voie
- Code postal
- Commune
- Code departement
- Code commune
- Surface reelle bati
- Nombre de pieces principales
- Nature culture
- Nature culture speciale
- Surface terrain
- Section cadastrale

Ces données sont très riches et contiennent beaucoup d'informations, la plupart ne nous interressant pas, car nous nous nous concentrons ici sur les appartement et maison, et non les locaux commerciaux, terrains à construire, parcs etc. De plus certains données sont aberrantes ou mal remplies (exemple : des appartement avec une valeur foncière de 1€).

Nous avons donc dû les trier, comme vous pourrez le voir plus bas.
## Présentation de l'application
L'application est composée d'une interface simple :
- Une selection entre Maison et Appartement
- Un champ pour entrer la surface du bien
- Un champ pour entrer la surface du terrain
- Un champ pour entrer le nombre de pièces
- Une liste de selection de la section cadastrale (non fonctionnelle)
- Un calendrier permettant de choisir le mois de la vente (non fonctionnelle)

- Un bouton pour valider les informations entrées
- Un affichage du prix estimé du bien

Afin de produire une estimation la plus juste possible, l'application fonctionne grâce à un algorithme de régression polynomiale de degré 2. Cet algorithme est entrainé sur les données de ventes de la ville de Saint-Etienne-du-Rouvray, et est capable de prédire le prix d'un bien immobilier en fonction de sa surface, de sa surface de terrain, de son nombre de pièces, de sa section cadastrale et du mois de la vente. 

La section cadastrale ainsi que le mois de vente prennent par défaut des valeurs correspondant à la moyenne des autres données (comprendre : une section cadastrale dont le prix moyen de vente au m² est le plus proche de la moyenne, et un mois de vente dont le prix moyen de vente au m² n'a pas beaucoup suivi l'inflation).

Le modèle de regression linéaire a été entraîné au préalable à partir d'un programme en python qui a servit à effectuer toutes les recherches. Seuls les coefficients extraits de la regression ont été importés dans l'application Android à des fins de poids et de vitesse d'exécution.

## Méthodologie utilisée pour explorer, trier et utiliser les données pour trouver les coefficients de regression

Un notebook Jupyter a été utilisé pour explorer les données, et trouver les coefficients de regression. Ce notebook est disponible sur la branche 'research' sous le nom 'visualization.ipynb' et contient tous les graphiques et commentaires nécessaires à la compréhension de la démarche.