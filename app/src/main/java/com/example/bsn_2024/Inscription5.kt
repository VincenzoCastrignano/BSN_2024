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

class Inscription5 : AppCompatActivity() {

    private lateinit var dateEditText: EditText
    private  lateinit var  dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription5)
        val button = findViewById<Button>(R.id.continuerDDN_genre)


        dateEditText = findViewById(R.id.editTextDate2)
        dbRef = FirebaseDatabase.getInstance().getReference("date")

        button.setOnClickListener {
            saveDate()
            val intent = Intent(this, Inscription6::class.java)
            startActivity(intent)
        }
    }

    private fun saveDate() {

        // Récupération des valeurs saisies dans les champs du formulaire

        val date = dateEditText.text.toString()

        val empId = dbRef.push().key!!

        val employee = Inscription4Model(empId,date)
        dbRef.child(empId).setValue(employee)
            .addOnCompleteListener{
                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener{err ->
                Toast.makeText(this,"Error ${err.message}", Toast.LENGTH_LONG).show()
            }
    }
}