package com.example.newbsn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inscription3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription3)

        val button = findViewById<Button>(R.id.continuerMdp_prenom)

        button.setOnClickListener {
            val intent = Intent(this, Inscription4::class.java)
            startActivity(intent)
        }
    }
}