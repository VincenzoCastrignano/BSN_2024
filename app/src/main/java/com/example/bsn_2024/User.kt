package com.example.bsn_2024

// TESTTT


import java.util.Dictionary

class User (
    var ID: Int,
    var fami_name: String,
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
    var rdv: Array<String>
){

    init {
        fami_name=fami_name
        println("Le nom de la personne est $fami_name")
    }



    fun Inscription() {
        /*
        Toutes les données sont récupérer sur l'app
        fami_name = Nom de famille
        first_name = Prénom
        age = Age

         */
    }
}


fun main(){
    val personne = User(1, "Castrignano", "Vincenzo", 19)
}
