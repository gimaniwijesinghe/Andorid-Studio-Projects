package com.example.simplegallery

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var buttonSigiriya:Button
    lateinit var buttonAnuradapura:Button
    lateinit var buttontempleofthetooth:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        buttonSigiriya = findViewById(R.id.buttonSigiriya)
        buttonAnuradapura = findViewById(R.id.buttonAnuradapura)
        buttontempleofthetooth = findViewById(R.id.buttonTempel)

        buttonSigiriya.setOnClickListener {
            imageView.setImageResource(R.drawable.sigiriya)
        }
        buttonAnuradapura.setOnClickListener {
            imageView.setImageResource(R.drawable.anuradapura)
        }
        buttontempleofthetooth.setOnClickListener {
            imageView.setImageResource(R.drawable.temple)
        }


    }
}