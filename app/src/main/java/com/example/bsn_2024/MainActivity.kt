package com.example.bsn_2024

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.bsn_2024.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var editText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text_name2)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

    }

    fun onButtonClick(view: View) {
        // Récupération de la saisie utilisateur
        val text = editText.text.toString()

        // Vérifie si l'utilisateur a saisi quelque chose
        if (text.isNotEmpty()) {
            // Utilisez la variable 'text' pour faire quelque chose
            // par exemple, afficher une boîte de dialogue
            Toast.makeText(this, "Saisie : $text", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Aucune saisie", Toast.LENGTH_SHORT).show()
        }
    }



}
