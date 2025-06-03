# Projet Android E4A - Cléo Marguerettaz / Damien Nguyen

L'application présentée ici propose un affichage ergonomique d'une liste de séries populaires. Cette liste est établi par un service tierce.

## Décisions architecturales :

Les données sont récoltées via l'API à travers l'interface TvShowApi. Elles sont ensuite stockées dans des classes formatées : TvShow et TvShows.

La classe TvShowViewModel permet de d'appeler les données formatées et de les garder accessibles aux fonctions de type View. C'est le cas de la fonction TvSeriesScreen qui arrange une colonne LazyColumn contenant chaque série ainsi que leur titre.

## Mode d'emploi :

Pour lancer l'application, il faut exécuter l'app qui se trouve en haut d'Android Studio.

![image](https://github.com/user-attachments/assets/39a3e70b-a377-4094-8a4d-61fc22df81c7)


### Rendu de l'application :

![image](https://github.com/user-attachments/assets/650e2519-524a-48d7-b111-3e0d9b78612e)


