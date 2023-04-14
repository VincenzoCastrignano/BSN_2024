package com.example.bsn_2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class Inscription3 : AppCompatActivity() {
    private lateinit var passwordEditText: EditText
    private  lateinit var  dbRef: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription3)
        passwordEditText = findViewById(R.id.editTextTextPassword)
        dbRef = FirebaseDatabase.getInstance().getReference("Password")
        val button = findViewById<Button>(R.id.continuerMdp_prenom)



        button.setOnClickListener {
            savePassword()
            val intent = Intent(this, Inscription4::class.java)
            startActivity(intent)
        }
    }

    private fun savePassword() {

        // Récupération des valeurs saisies dans les champs du formulaire

        val password = passwordEditText.text.toString()

        val empId = dbRef.push().key!!

        val employee = Inscription1Model(empId,password)
        dbRef.child(empId).setValue(employee)
            .addOnCompleteListener{
                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener{err ->
                Toast.makeText(this,"Error ${err.message}", Toast.LENGTH_LONG).show()
            }
    }
}