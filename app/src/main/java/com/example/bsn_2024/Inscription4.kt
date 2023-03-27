package com.example.bsn_2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Inscription4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription4)
        val button = findViewById<Button>(R.id.continuerPrenom_DDN)

        button.setOnClickListener {
            val intent = Intent(this, Inscription5::class.java)
            startActivity(intent)
        }
    }
}