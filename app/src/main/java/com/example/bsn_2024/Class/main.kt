package com.example.bsn_2024

import com.example.bsn_2024.Class.User

fun main() {
    val moi = User(1,
        "Castrignano",
        "Vincenzo",
        19,
        "vincenzo.castrignano@esqese.ucly.fr",
        true,
        conversation = arrayOf(""),
        password = "userpassword",
        phone = "0625817826",
        gender = true,
        trajet = arrayOf(""),
        place = arrayOf(""))

    val a = moi.get_user()
    println(a)


}