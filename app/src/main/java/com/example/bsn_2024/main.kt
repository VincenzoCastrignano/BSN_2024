package com.example.bsn_2024

import com.example.bsn_2024.Class.Friend
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


    val ami = Friend(
        1,
        "Beaudoin",
        "Eliott",
        19,
        "eliott.beaudoin@esqese.ucly.fr",
        "0601020304",
        true
    )

    val a = moi.get_user()
    val b = ami.get_friend()

    println(a)
    println(b)
}