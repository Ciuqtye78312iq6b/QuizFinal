package com.cdp.quizfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class Pregunta5 : AppCompatActivity() {
    lateinit var bsiguiente: Button
    lateinit var btnResA:Button
    lateinit var btnResB:Button
    lateinit var btnResC:Button
    lateinit var btnResD:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta5)

        btnResA = findViewById(R.id.btnRespuestaA)
        btnResB = findViewById(R.id.btnRespuestaB)
        btnResC = findViewById(R.id.btnRespuestaC)
        btnResD = findViewById(R.id.btnRespuestaD)

        btnResA.setOnClickListener({
            val intent1 = Intent(this,Resultado::class.java)
            Toast.makeText(this,"Esta mal tu respuesta", Toast.LENGTH_SHORT).show()
            Resultados.results.add(1)
            startActivity(intent1)
        })
        btnResB.setOnClickListener({
            //Resultados.contRespCor++
            Resultados.results.add(2)
            Toast.makeText(this,"Esta correcta tu respuesta", Toast.LENGTH_SHORT).show()
            val intent=Intent(this,Resultado::class.java)
            startActivity(intent)
        })
        btnResC.setOnClickListener({
            val intent3 = Intent(this,Resultado::class.java)
            Toast.makeText(this,"Esta mal tu respuesta", Toast.LENGTH_SHORT).show()
            Resultados.results.add(3)
            startActivity(intent3)
        })
        btnResD.setOnClickListener({
            val intent4 = Intent(this,Resultado::class.java)
            Toast.makeText(this,"Esta mal tu respuesta", Toast.LENGTH_SHORT).show()
            Resultados.results.add(4)
            startActivity(intent4)
        })
    }
}