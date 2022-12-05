package com.example.bsn_2024

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context : Context): SQLiteOpenHelper(context, DB_NAME, DB_VERSION ) {

    companion object{
        private val DB_NAME = "task"
        private val DB_VERSION = 1
    }
}