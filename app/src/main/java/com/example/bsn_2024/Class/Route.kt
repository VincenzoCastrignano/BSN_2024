package com.example.bsn_2024.Class

import java.sql.Time

class Route(var ID_user: Int,
            var ID_place_start: Int,
            var ID_place_end: Int,
            var horaire: Time) {

    fun get_user(): Route {
        return Route(ID_user, ID_place_start, ID_place_end, horaire)
    }

    override fun toString(): String {
        return ("ID user : $ID_user \n" +
                "ID de la place de depart : $ID_place_start\n" +
                "ID de la place de fin : $ID_place_end\n" +
                "Heure du trajet : $horaire\n")
    }
}