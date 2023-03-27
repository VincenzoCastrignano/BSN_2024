package com.example.bsn_2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainPage : AppCompatActivity() {
    private lateinit var CreerCompte:Button
    private lateinit var Connexion:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        CreerCompte = findViewById<Button>(R.id.inscription)

        CreerCompte.setOnClickListener {
            val intent = Intent(this, Inscription1::class.java)
            startActivity(intent)
        }
    }
}

