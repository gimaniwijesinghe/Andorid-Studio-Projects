package com.example.explicitlntentdemo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the layout for this activity
        setContentView(R.layout.activity_third_activty)

        // Get reference to the TextView and set the thank you message
        val textView = findViewById<TextView>(R.id.textViewThankYou)
        textView.text = "Thank You!!"

    }
}
