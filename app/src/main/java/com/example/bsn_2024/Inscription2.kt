package com.example.bsn_2024

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.FirebaseApp


class Inscription2 : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private  lateinit var  dbRef: DatabaseReference

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription2)
        val button = findViewById<Button>(R.id.telephone)
        emailEditText = findViewById(R.id.Password)

        dbRef = FirebaseDatabase.getInstance().getReference("Email")

        button.setOnClickListener {
            val intent = Intent(this, Inscription1::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.buttonContinuerInscriptionEmail)

        button1.setOnClickListener {
            saveEmail()
            val intent1 = Intent(this, Inscription3::class.java)
            startActivity(intent1)
        }
    }
    private fun saveEmail() {

        // Récupération des valeurs saisies dans les champs du formulaire

        val email = emailEditText.text.toString()

        val userId = dbRef.push().key!!

        val user = Inscription2Model(userId,email)
        dbRef.child(userId).setValue(user)
            .addOnCompleteListener{
                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener{err ->
                Toast.makeText(this,"Error ${err.message}", Toast.LENGTH_LONG).show()
            }
    }
}