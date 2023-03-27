package com.example.bsn_2024.Class

class Friends(var ID_friend: Int,
              var date_friend: String,
              var ID_user: Int,
              var ID_user2: Int) {

    fun get_user(): Friends {
        return Friends(ID_friend, date_friend, ID_user, ID_user2)
    }

    override fun toString(): String {
        return ("ID friend: $ID_friend \n" +
                "Date friend : $date_friend\n" +
                "ID user : $ID_user\n" +
                "ID user 2 : $ID_user2\n")
    }
}