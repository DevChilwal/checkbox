package com.example.newproject
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.submitButton)
        button.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Your response has been recorded", Toast.LENGTH_LONG
            ).show()

        }
    }
}