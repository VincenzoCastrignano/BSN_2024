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


class Inscription1 : AppCompatActivity() {

    private lateinit var numeroEditText: EditText
    private  lateinit var buttonInscription: Button
    private  lateinit var  dbRef: DatabaseReference

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription1)
        val button = findViewById<Button>(R.id.button_email_inscription)
        buttonInscription = findViewById<Button>(R.id.button_continuer_inscription_telepone)
        numeroEditText = findViewById(R.id.Password)

        dbRef = FirebaseDatabase.getInstance().getReference("Telephone")

        buttonInscription.setOnClickListener {
            savePhone()
            val intent = Intent(this, Inscription2::class.java)
            startActivity(intent)
        }

        buttonInscription.setOnClickListener {
            savePhone()
            val intent1 = Intent(this, Inscription3::class.java)
            startActivity(intent1)
        }
    }
    private fun savePhone() {

        // Récupération des valeurs saisies dans les champs du formulaire

        val number = numeroEditText.text.toString()

        val empId = dbRef.push().key!!

        val employee = Inscription1Model(empId,number)
        dbRef.child(empId).setValue(employee)
            .addOnCompleteListener{
                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener{err ->
                Toast.makeText(this,"Error ${err.message}", Toast.LENGTH_LONG).show()
            }
    }
}