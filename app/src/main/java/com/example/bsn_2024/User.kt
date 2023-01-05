package com.example.bsn_2024
import java.util.Dictionary

class User(var ID: Int,
           var last_name: String,
           var first_name: String,
           var age: Int,
           var mail: String,
           var geoloc: Boolean,
           var friend: Array<String>,
           var conversation: Array<String>,
           var config: Array<String>,
           var user_name: String,
           var user_pwd: String,
           var phone: String,
           var sex: Boolean,
           var trajet: Array<String>,
           var rdv: Array<String>) {

    fun get_user(): User {
        return User(ID, last_name, first_name, age, mail, geoloc, friend, conversation, config, user_name, user_pwd, phone, sex, trajet, rdv)
    }

    override fun toString(): String {
        return ("ID : $ID \n" +
                "last_name : $last_name\n" +
                "first_name : $first_name\n" +
                "age : $age\n" +
                "mail : $mail\n" +
                "geoloc : $geoloc\n" +
                "friend : $friend\n" +
                "conversation : $conversation\n" +
                "config : $config\n" +
                "user_name : $user_name\n" +
                "user_pwd : $user_pwd\n" +
                "phone : $phone\n" +
                "sex : $sex\n" +
                "trajet : $trajet\n" +
                "rdv : $rdv\n")
    }

    fun inscription(): String {
        println("Methode Inscription User")
        /*
        Toutes les données sont récupérées sur l'app
        last_name = Nom de famille
        first_name = Prénom
        age = Age
         */
        return "Méthode Inscription"
    }

    fun connexion() {

    }
}