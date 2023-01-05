package com.example.bsn_2024

fun main() {
    val moi = User(1,
        "Castrignano",
        "Vincenzo",
        "26-11-2003",
        "vincenzo.castrignano@esqese.ucly.fr",
        true,
        "userpassword",
        "0625817826",
        true,
        true)

    val a = moi.get_user()
    println(a)
}