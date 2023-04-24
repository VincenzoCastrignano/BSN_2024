package com.example.bsn_2024


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import android.annotation.SuppressLint
import android.content.Intent
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.DatabaseReference

class Trajet : AppCompatActivity() {

    private lateinit var dbRef: DatabaseReference
    private lateinit var pointA: EditText
    private lateinit var pointB: EditText
    private lateinit var Time: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trajet)

        dbRef = FirebaseDatabase.getInstance().getReference("Trajet")

        val button = findViewById<Button>(R.id.btn_calculer_trajet)


        val pointA = findViewById<EditText>(R.id.et_point_a)
        val pointB = findViewById<EditText>(R.id.et_point_b)
        val Time = findViewById<EditText>(R.id.et_date_heure)

        button.setOnClickListener {
            saveValuesRoute()
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }

    }

    private fun saveValuesRoute() {



        val pointA = pointA.text.toString()
        val pointB = pointB.text.toString()
        val Time = Time.text.toString()

        val empId = dbRef.push().key!!

        val employee = TrajetModel(empId, pointA, pointB, Time)

        dbRef.child(empId).setValue(employee)
            .addOnCompleteListener {
                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener { err ->
                Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_LONG).show()
            }
    }
}