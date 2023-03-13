package com.example.bsn_2024.Class

class Settings(var ID_User: Int,
                var password: String,
                var pseudo: String) {

        fun get_user(): Settings {
            return Settings(ID_User, password, pseudo)
        }

        override fun toString(): String {
            return ("ID du user : $ID_User \n" +
                    "password : $password\n" +
                    "pseudo : $pseudo\n")
        }
    }
