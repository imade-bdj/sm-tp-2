package com.example.sm_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEt = findViewById<EditText>(R.id.nameEt)
        val prenomEt = findViewById<EditText>(R.id.prenomEt)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

        // handle button click
        saveBtn.setOnClickListener {
            // get text from edittexts
            val name = nameEt.text.toString()
            val prenom = prenomEt.text.toString()

            // intent to start activity
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Prenom", prenom)
            startActivity(intent)

        }

    }
}