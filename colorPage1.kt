package com.example.coloris

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class colorPage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_page1)

        val highButton = findViewById(R.id.highButton) as Button
        highButton.setOnClickListener {
            val intent = Intent(this, shirtColor::class.java)
            startActivity(intent)
        }
    }
}