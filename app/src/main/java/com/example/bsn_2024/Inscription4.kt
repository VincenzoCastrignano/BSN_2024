package com.example.bsn_2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class Inscription4 : AppCompatActivity() {


    private lateinit var lastnameEditText: EditText
    private lateinit var nameEditText: EditText
    private  lateinit var  dbRef: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription4)
        val button = findViewById<Button>(R.id.continuerPrenom_DDN)

        lastnameEditText = findViewById(R.id.Password)
        nameEditText = findViewById(R.id.Password1)
        dbRef = FirebaseDatabase.getInstance().getReference("Users")



        button.setOnClickListener {
            saveName()
            val intent = Intent(this, Inscription5::class.java)
            startActivity(intent)
        }
    }

    private fun saveName() {

        // Récupération des valeurs saisies dans les champs du formulaire

        val lastname = lastnameEditText.text.toString()
        val name = nameEditText.text.toString()

        val empId = dbRef.push().key!!

        val employee = Inscription4Model(empId,lastname,name)
        dbRef.child(empId).setValue(employee)
            .addOnCompleteListener{
                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener{err ->
                Toast.makeText(this,"Error ${err.message}", Toast.LENGTH_LONG).show()
            }
    }
}