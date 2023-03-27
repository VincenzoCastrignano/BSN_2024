package com.example.bsn_2024.Class

class Message(var ID_message: Int,
              var text: String,
              var date: String,
              var destinataire: Int,
              var ID_user: Int) {

    fun get_user(): Message {
        return Message(ID_message, text, date, destinataire, ID_user)
    }

    override fun toString(): String {
        return ("ID du message : $ID_message \n" +
                "Contenu du message : $text\n" +
                "Date de l'envoie : $date\n" +
                "ID du recepteur : $destinataire\n" +
                "ID de l'envoyeur : $ID_user\n")
    }
}