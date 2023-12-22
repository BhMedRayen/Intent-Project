package com.mohamedrayen.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btn2 = findViewById<Button>(R.id.button)
        btn2.setOnClickListener{
           val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
           val visitGoogle = Intent(android.content.Intent.ACTION_VIEW)
            visitGoogle.data = Uri.parse("https://www.google.com")
            startActivity(visitGoogle)
        }
        val btnV = findViewById<Button>(R.id.web)
        btnV.setOnClickListener {
            val visitWebView = Intent(this,Web::class.java)
            startActivity(visitWebView)
        }
    }
}