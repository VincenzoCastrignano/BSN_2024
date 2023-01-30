package com.example.bsn_2024.Class;

class Friend(
        var ID: Int,
        var last_name: String,
        var first_name: String,
        var age: Int,
        var mail: String,
        var phone: String,
        var sex: Boolean
    ) {
        fun get_friend(): Friend{
            return Friend(ID, last_name, first_name, age, mail , phone, sex)
    }
}