package database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context : Context): SQLiteOpenHelper(context, DB_NAME,null, DB_VERSION ) {

    companion object{
        private val DB_NAME = "task"
        private val DB_VERSION = 1
        private val TABLE_NAME = "tasklist"
        private val ID = "id"
        private val TASK_NAME = "taskname"
        private val TASK_DETAILS = "taskdetails"

    }

    override fun onCreate(p0: SQLiteDatabase?) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($ID INTEGER PRIMARY, $TASK_NAME TEXT, $TASK_DETAILS TEXT);"
        p0?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        val DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
        p0?.execSQL(DROP_TABLE)
        onCreate(p0)

    }
}