package com.example.newbsn

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inscription5 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription5)
        val button = findViewById<Button>(R.id.continuerDDN_genre)
        val button1 = findViewById<Button>(R.id.Back5)

        button.setOnClickListener {
            val intent = Intent(this, Inscription6::class.java)
            startActivity(intent)
        }
        button1.setOnClickListener {
            val intent = Intent(this, Inscription4::class.java)
            startActivity(intent)
        }
    }
}