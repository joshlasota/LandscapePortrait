package com.example.landscapeportrait

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Landscape or Portrait"

        var button1 = findViewById<Button>(R.id.button)

        button1.setOnClickListener {
            if( button1.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                Toast.makeText(
                    this@MainActivity,
                    "This is Portrait Mode",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "This is Landscape Mode",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}