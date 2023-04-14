package com.example.bsn_2024


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import android.annotation.SuppressLint
import android.content.Intent
import com.example.bsn_2024.Routing.RouteData
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.DatabaseReference

class TrajetActivity : AppCompatActivity() {

    private lateinit var dbRef: DatabaseReference
    private lateinit var buttonRoute: Button
    private lateinit var pointA: EditText
    private lateinit var pointB: EditText
    private lateinit var Time: EditText


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trajet)

        dbRef = FirebaseDatabase.getInstance().getReference("Trajet")

        buttonRoute = findViewById<Button>(R.id.btn_calculer_trajet)


        val pointA = findViewById<EditText>(R.id.et_point_a)
        val pointB = findViewById<EditText>(R.id.et_point_b)
        val Time = findViewById<EditText>(R.id.et_date_heure)

        buttonRoute.setOnClickListener {
            saveValuesRoute()
            val intent = Intent(this, // ? Inscription2::class.java)
            startActivity(intent)
        }

    }

    private fun saveValuesRoute() {

        val ID = dbRef.push().key!!

        val pointA = pointA.text.toString()
        val pointB = pointB.text.toString()
        val Time = Time.text.toString()


        val Routing = RouteData(ID, pointA, pointB, Time)

        dbRef.child(ID).setValue(Routing)
            .addOnCompleteListener {
                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener { err ->
                Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_LONG).show()
            }
    }
}