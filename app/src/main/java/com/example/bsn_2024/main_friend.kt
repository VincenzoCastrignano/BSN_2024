package com.example.bsn_2024

import com.example.bsn_2024.Class.Friend




fun main() {
    val ami = Friend(
        1,
        "Beaudoin",
        "Eliott",
        20,
        "eliott.beaudoin@esqese.ucly.fr",
        "0601020304",
        true
    )

    val b = ami.get_friend()

    println(b)
}