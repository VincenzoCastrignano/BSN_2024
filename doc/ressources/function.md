# **Ce document contient toutes les méthodes de chaque classes de l'application**

## Class Bdd :

* Hook_BDD()  
    Cette méthode à pour rôle de récupérer les données de la BDD pour en ressortir un array de toute la BDD ou un user en particulier.
    Dans un objectif d'optimiser le code, lorsqu'elle sera appelée, elle aura besoin d'un paramètre essentiel :  
    * : `String ou Int`  
    Ce paramètre sert à retrouver la donnée que nous souhaitons récupérer dans la BDD.

## Class User :

* Inscription()  

    Cette méthode consiste à créer un nouvel utilisateur, depuis la <u>*page_inscription*</u>.  
    Elle aura donc besoin de plusieurs paramètres, celui que l'utilisateur doit saisir, cad :
    * Nom : `String`
    * Prénom : `String`
    * Âge : `Int`
    * Autorisation de l'usage de sa location sur l'app:  `Boolean`
    * Mail: `String`
    * Pseudo: `String`
    * Mot de passe: `String`
    * Numéro de téléphone: `String`  

    Cette méthode aura besoin d'envoyer les informations vers la base de données, elle appelera la méthode `Send_Bdd()` de la classe <u>`BDD`</u>.


* Connexion()  
    Cette méthode consiste à l'utilisateur de se connecter sur l'app, depuis sur la page <u>*connexion1*</u>.  
    Elle aura donc besoin de plusieurs paramètres, celui que l'utilisateur doit saisir, cad :  
    * Pseudo : `String`
    * Mot de passe : `String`  

    Elle procèdera ensuite par un appel vers la bdd afin de vérifier si le Pseudo et le Mdp correspondent à l'utilisateur.


* En cours...
* En cours...
* En cours...
* En cours...
* En cours...