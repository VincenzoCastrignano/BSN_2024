package com.example.bsn_2024

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inscription5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription5)
        val button = findViewById<Button>(R.id.continuerDDN_genre)

        button.setOnClickListener {
            val intent = Intent(this, Inscription6::class.java)
            startActivity(intent)
        }
    }
}