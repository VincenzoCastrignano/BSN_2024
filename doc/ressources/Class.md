# **Les méthodes de chaque class de l'application**

## Class BDD :

* hook()  
    Cette méthode à pour rôle de récupérer les données de la BDD pour en ressortir un array de toute la BDD ou un user en particulier.
    Dans un objectif d'optimiser le code, lorsqu'elle sera appelée, elle aura besoin d'un paramètre essentiel :  
    * info : `String`  
    *Ce paramètre sert à retrouver la donnée que nous souhaitons récupérer dans la BDD*

* send()  
    Cette méthode envoie le paramètre à la BDD
    * Le paramètre varie en fonction de ce dont nous voulons envoyer, elle peut être utilisé pour envoyer ou même modifier la BDD.

* update()  
    Cette méthode modifie le contenu de la BDD, elle prend en paramètre :   
    * La méthode `Hook()` avec le user visé
    * value : `Array`
    <br> Avec ces deux paramètres, la méthode modifie <u>value</u> et retourne la méthode <u>`Send`</u> avec <u>value</u> en paramètre de cette dernière.

* add()  
    Cette méthode à pour but d'envoyer de nouvelles données à l'utilisateur  
    Elle a pour paramètre :  
    * value : `Array`
    * new_value : `*`
    <br> La <u>new_value</u> dépend de ce qu'on veut ajouter au niveau de la BDD, l'objectif est d'ajouter une nouvelle donnée à l'utilisateur

* create()  **`A modif`**  
    Cette méthode à pour rôle de créer un nouvel utilisateur sur la bdd  
    * value : `Array`  
    <br>Elle retourne `Send()` avec la valeur <u>value</u> pour ajouter un nouvel utilisateur.

---
## Class User :

* inscription()  

    Cette méthode consiste à créer un nouvel utilisateur, depuis la <u>*page_inscription*</u>.
    Elle aura donc besoin de plusieurs paramètres, celui que l'utilisateur doit saisir, cad :
    * last_name : `String`
    * name : `String`
    * age : `Int`
    * geoloc:  `Boolean`
    * mail: `String`
    * pseudo: `String`
    * password: `String`
    * phone_number: `String`  
    <br>
    Cette méthode aura besoin d'envoyer les informations vers la base de données, elle appelera la méthode `Create()` de la classe <u>`BDD`</u> avec les paramètres de l'utilisateur.


* connexion()  
    Cette méthode consiste à l'utilisateur de se connecter sur l'app, depuis sur la page <u>*connexion1*</u>.  
    Elle aura donc besoin de plusieurs paramètres, celui que l'utilisateur doit saisir, cad :  
    * pseudo : `String`
    * password : `String`  

    Elle procèdera ensuite par un appel vers la méthode `Hook()` de la classe <u>`BDD`</u> afin de procéder à un vérification pour voir si le <u>pseudo</u> et le <u>password</u> correspondent à l'utilisateur.


* update_user()  
    Cette méthode permet à l'utilisateur de modifier un paramètre de son compte, il y accèdera par l'interface réglage. Elle aura pour paramètre :  
    * info : `String`
    * value : `*`  
    La méthode récupère la bdd avec la méthode `Hook()`, avec le paramètre <u>info</u>,



* En cours...
---
## Class Friends :

* add_friend()  
    Cette méthode permet à l'utilisateur d'ajouter un amis  
    `À détailler`

* del_friend()  
    Cette méthode permet à l'utilisateur de supprimer un amis  
    `À détailler`

* En cours...