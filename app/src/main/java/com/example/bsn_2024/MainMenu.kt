package com.example.bsn_2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        val button = findViewById<Button>(R.id.button8)

        button.setOnClickListener {
            val intent = Intent(this, Messages::class.java)
            startActivity(intent)
        }
    }
}