package com.example.collegeconnection

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val collegeid = true
        if (collegeid)
        {


        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, detail::class.java)
            startActivity(intent)
        }
           run {
            val button1 = findViewById<Button>(R.id.button1)
            button1.setOnClickListener {
                Toast.makeText(applicationContext, "College id invalid", Toast.LENGTH_SHORT).show()
            }
        }

        }
    }
}
