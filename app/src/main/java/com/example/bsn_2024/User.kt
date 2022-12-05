package com.example.bsn_2024


import java.util.Dictionary

class User {
    var ID: Int = 1
    var last_name: String = "Castrignano"
    var first_name: String ="Vincenzo"
    var age: Int = 18
    var mail: String = "vincenzo.castrignano@esqese.ucly.fr"
    var geoloc: Boolean =true
    var friend: Array<String> = arrayOf("")
    var conversation: Array<String> = arrayOf("")
    var config: Array<String> = arrayOf("")
    var user_name: String = "Slayzen"
    var user_pwd: String = "Slayzenmdp"
    var phone: String = "0626273337"
    var sex: Boolean = true
    var trajet: Array<String> = arrayOf("")
    var rdv: Array<String> = arrayOf("")

    init {
        println("Le nom de la personne est $last_name")
    }


    fun show_User() {

    }

    fun Inscription() {
        println("Methode Inscription User")
        /*
        Toutes les données sont récupérées sur l'app
        last_name = Nom de famille
        first_name = Prénom
        age = Age
         */
    }
}

<<<<<<< HEAD
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
=======

//fun main(){
    //val personne = User(1, "Castrignano", "Vincenzo", 19, "")
//}
>>>>>>> 59a45dd8653b588a22d1717a857b51fbcc442ffd
