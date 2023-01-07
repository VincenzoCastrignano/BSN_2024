# Organisation BDD

## La Base de données se fera sur __PhpMyAdmin__  

## L'arbre structure de la base est sur le __côté gauche__ 

* __Create DB__  
    - name
    - create  
* __Create table__  
    - name
    - nombres <u>colonnes</u> = nombre d'<u>attributs</u>
    - create  
* __Table__  
    - name
    - Type (`Int`, `varchar`, `etc...`)
    - Save  
* __Index__ (keys)  
    - choisir une colonne (table)  
    - mettre l'<u>id</u> en `Primary`  
    - click '`go`'  

---


* __Insert__ (mettre value dans la table)  
    - Entrer values <u>`foreach`</u> attribute  
    - click '`go`'  
* __Compte user__
    - click '`PhpMyAdmin`'  
    - Ajouter un compte utilisateur  
    - nom user
    - hôte  
    - password
    - Extension d'authentification : `Auth MySql native`
    - click '`executer`'
* __MySql Connectors__
    - Aller sur <u>MySql Connectors</u> (dans www.mysql.com)
    - Download : `JDBC Driver for MySql`
    (Connecteur pour java, se rapproche le plus de kotlin)  
    - Select operating synstem : `Plateforme Independant`  
    - Download le `.zip` (pas le `.tar.gz`)
    - Extraire tout
    - Copier <u>`mysql-connector-j-8.0.31.jar`</u> sur le dossier
    database dans Android Studio
    - `Add as a library`
---
## Au niveau du Code

* __@JvmStatic__
    - Spécifie qu'une <u>méthode statique supplémentaire</u> doit être générée d'un élément si c'est une <u>fonction</u>.