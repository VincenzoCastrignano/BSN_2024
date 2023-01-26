package com.example.bsn_2024

import com.example.bsn_2024.Class.User

fun main() {
    val moi = User(1,
        "Castrignano",
        "Vincenzo",
        19,
        "vincenzo.castrignano@esqese.ucly.fr",
        true,
        friend = arrayOf(""),
        conversation = arrayOf(""),
        config = arrayOf(""),
        "Username",
        "userpassword",
        "0625817826",
        true,
        trajet = arrayOf(""),
        rdv = arrayOf(""))

    val a = moi.get_user()
    println(a)


}