package com.example.coloris

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorButton = findViewById(R.id.colorButton) as Button
        colorButton.setOnClickListener {
            val intent = Intent(this, colorPage1::class.java)
            startActivity(intent)
        }
    }
}