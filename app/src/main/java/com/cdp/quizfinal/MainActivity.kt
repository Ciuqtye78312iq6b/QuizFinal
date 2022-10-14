package com.cdp.quizfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var bComenzar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bComenzar = findViewById(R.id.btnComenzar)

        bComenzar.setOnClickListener({
            val intent = Intent(this,Pregunta1::class.java)
            startActivity(intent)
        })
    }
}