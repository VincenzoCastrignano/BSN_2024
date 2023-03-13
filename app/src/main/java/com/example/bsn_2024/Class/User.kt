package com.example.bsn_2024.Class

class User(var ID_user: Int,
           var name: String,
           var lastName: String,
           var age: Int,
           var mail: String,
           var location: Boolean,
           var phone: String,
           var gender: Boolean,
           var trajet: Route,
           var conversation: Message,
           var settings: Settings,
           var place: Place) {

    fun get_user(): User {
        return User(ID_user, name, lastName, age, mail, location, phone, gender, trajet, conversation, settings, place)
    }

    override fun toString(): String {
        return ("ID : $ID_user \n" +
                "name : $name\n" +
                "lastName : $lastName\n" +
                "age : $age\n" +
                "mail : $mail\n" +
                "location : $location\n" +
                "phone : $phone\n" +
                "gender : $gender\n" +
                "trajet : $trajet\n" +
                "conversation : $conversation\n" +
                "settings : $settings\n" +
                "place : $place\n")
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