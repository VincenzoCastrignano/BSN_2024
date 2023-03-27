package com.example.bsn_2024
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inscription6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription6)
        val button = findViewById<Button>(R.id.continuergenre_CGU)

        button.setOnClickListener {
            val intent = Intent(this, Inscription7::class.java)
            startActivity(intent)
        }
    }
}