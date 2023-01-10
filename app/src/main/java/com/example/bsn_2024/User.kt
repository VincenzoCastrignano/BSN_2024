package com.example.bsn_2024

class User(var ID: Int,
           var last_name: String,
           var first_name: String,
           var birth: String,
           var mail: String,
           var geoloc: Boolean,
           var pwd: String,
           var phone: String,
           var sex: Boolean,
           var cgu: Boolean) {

    fun get_user(): User {
        return User(ID, last_name, first_name, birth, mail, geoloc, pwd, phone, sex, cgu)
    }

    override fun toString(): String {
        return ("ID : $ID \n" +
                "last_name : $last_name\n" +
                "first_name : $first_name\n" +
                "birth : $birth\n" +
                "mail : $mail\n" +
                "geoloc : $geoloc\n" +
                "pwd : $pwd\n" +
                "phone : $phone\n" +
                "sex : $sex\n" +
                "cgu : $cgu\n")
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
        // Pas encore fait.
    }
}