package com.cdp.quizfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Pregunta4 : AppCompatActivity() {
    lateinit var bsiguiente:Button
    lateinit var btnResA:Button
    lateinit var btnResB:Button
    lateinit var btnResC:Button
    lateinit var btnResD:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta4)

        btnResA = findViewById(R.id.btnRespuestaA)
        btnResB = findViewById(R.id.btnRespuestaB)
        btnResC = findViewById(R.id.btnRespuestaC)
        btnResD = findViewById(R.id.btnRespuestaD)


        btnResA.setOnClickListener({
            val intent1 = Intent(this,Pregunta5::class.java)
            Toast.makeText(this,"Esta mal tu respuesta", Toast.LENGTH_SHORT).show()
            Resultados.results.add(1)
            startActivity(intent1)
        })
        btnResB.setOnClickListener({
            val intent2 = Intent(this,Pregunta5::class.java)
            Toast.makeText(this,"Esta mal tu respuesta", Toast.LENGTH_SHORT).show()
            Resultados.results.add(2)
            startActivity(intent2)
        })
        btnResC.setOnClickListener({
            val intent3 = Intent(this,Pregunta5::class.java)
            Toast.makeText(this,"Esta mal tu respuesta", Toast.LENGTH_SHORT).show()
            Resultados.results.add(3)
            startActivity(intent3)
        })
        btnResD.setOnClickListener({
            Resultados.results.add(4)
            Toast.makeText(this,"Esta correcta tu respuesta", Toast.LENGTH_SHORT).show()
            val intent=Intent(this,Pregunta5::class.java)
            startActivity(intent)
        })
    }
}