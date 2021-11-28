package com.vova.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private const val HELLO_KEY = "Hello"

class MainActivity : AppCompatActivity() {
    lateinit var nextActivityButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {
           val secondActivityIntent:Intent = Intent(this, SecondActivity::class.java)
           secondActivityIntent.putExtra(HELLO_KEY,"Hello from MainActivity")

            startActivity(secondActivityIntent)
        }
    }
}