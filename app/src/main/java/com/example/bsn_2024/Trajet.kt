package com.example.bsn_2024

import com.example.bsn_2024.Class.Route
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Trajet : AppCompatActivity() {

    private fun sendRoute(ID: Int, pointA: String, pointB: String, dateHeureStr: String): Route {
        val ID = 1
        val pointA = "test"
        val pointB = "Test"
        val dateHeureStr = "12:00:00"

        return Route(ID, pointA, pointB, dateHeureStr)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trajet)


        val buttonRoute = findViewById<Button>(R.id.btn_calculer_trajet)
        val pointA = findViewById<EditText>(R.id.et_point_a)
        val pointB = findViewById<EditText>(R.id.et_point_b)
        val Time = findViewById<EditText>(R.id.et_date_heure)


        buttonRoute.setOnClickListener {
            val routeA = pointA.text.toString()
            val routeB = pointB.text.toString()

            val message = "Trajet de : , $routeA, $routeB"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}