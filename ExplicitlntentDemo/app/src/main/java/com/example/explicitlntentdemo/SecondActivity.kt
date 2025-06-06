package com.example.explicitlntentdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the layout for this activity
        setContentView(R.layout.activity_second)

        // Get references to the Button and TextView from the layout
        val button = findViewById<Button>(R.id.buttonThanks)
        val textView = findViewById<TextView>(R.id.textviewResult)
        // Retrieve the user's name from the intent extras
        val name = intent.getStringExtra("user_name")
        // Display a welcome message with the user's name
        textView.text = "Welcome,$name!"

        // Set a click listener on the button
        button.setOnClickListener {
            // Create an explicit intent to start ThirdActivty
            val intent = Intent(this,ThirdActivty::class.java)
            // Start ThirdActivty
            startActivity(intent)
        }

    }
}
