package com.example.musictheoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ScrollView
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val noteIdButton = findViewById<Button>(R.id.noteIdButton)
        noteIdButton.setOnClickListener{
            val noteIdIntent = Intent(this, NoteIdentification::class.java)
            startActivity(noteIdIntent)
        }

    }
}
