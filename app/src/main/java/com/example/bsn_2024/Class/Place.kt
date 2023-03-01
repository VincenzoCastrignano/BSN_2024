package com.example.bsn_2024.Class

class Place(var ID_place: Int,
            var name: String,
            var longitude: String,
            var latitude: String,
            var arret: String) {

    fun get_user(): Place {
        return Place(ID_place, name, longitude, latitude, arret)
    }

    override fun toString(): String {
        return ("ID de la place : $ID_place \n" +
                "nom : $name\n" +
                "longitude : $longitude\n" +
                "latitude : $latitude\n" +
                "nom de l'arret : $arret\n")
    }
}