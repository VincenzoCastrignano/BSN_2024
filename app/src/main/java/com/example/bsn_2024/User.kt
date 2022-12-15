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
        println("Fonction get_user()")
        println("$ID")
        return User(ID, last_name, first_name, age, mail, geoloc, friend, conversation, config, user_name, user_pwd, phone, sex, trajet, rdv)
    }

    fun show_User() {
        println("$ID")
        println("$last_name")
        println("$first_name")
        println("$age")
        println("$mail")
        println("$geoloc")
        println("$friend")
        println("$conversation")
        println("etc...")
    }

    fun inscription() {
        println("Methode Inscription User")
        /*
        Toutes les données sont récupérées sur l'app
        last_name = Nom de famille
        first_name = Prénom
        age = Age
         */
    }

    fun connexion() {

    }
}


/*
        (
        val ID: Int,
        val last_name: String,
        val first_name: String,
        val age: Int,
        val mail: String,
        val geoloc: Boolean,
        val friend: Array<String>,
        val conversation: Array<String>,
        val config: Array<String>,
        val user_name: String,
        val user_pwd: String,
        val phone: String,
        val sex: Boolean,
        val trajet: Array<String>,
        val rdv: Array<String>
        )
*/