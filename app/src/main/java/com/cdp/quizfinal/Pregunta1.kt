package com.cdp.quizfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Pregunta1 : AppCompatActivity() {

    lateinit var btnResA:Button
    lateinit var btnResB:Button
    lateinit var btnResC:Button
    lateinit var btnResD:Button
    lateinit var arrayCorrectas:ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta1)


        btnResA = findViewById(R.id.btnRespuestaA)
        btnResB = findViewById(R.id.btnRespuestaB)
        btnResC = findViewById(R.id.btnRespuestaC)
        btnResD = findViewById(R.id.btnRespuestaD)

        //Progrmacion de los clicks de los botones

        btnResA.setOnClickListener({
            val intent1 = Intent(this,Pregunta2::class.java)
            Toast.makeText(this,"Esta correcta tu respuesta",Toast.LENGTH_SHORT).show()
            Resultados.results.add(1)
            startActivity(intent1)
        })
        btnResB.setOnClickListener({
            val intent2 = Intent(this,Pregunta2::class.java)
            Toast.makeText(this,"Esta mal tu respuesta",Toast.LENGTH_SHORT).show()
            Resultados.results.add(2)
            startActivity(intent2)
        })
        btnResC.setOnClickListener({
            val intent3 = Intent(this,Pregunta2::class.java)
            Toast.makeText(this,"Esta mal tu respuesta",Toast.LENGTH_SHORT).show()
            Resultados.results.add(3)
            startActivity(intent3)
        })
        btnResD.setOnClickListener({
            val intent4 = Intent(this,Pregunta2::class.java)
            Toast.makeText(this,"Esta mal tu respuesta",Toast.LENGTH_SHORT).show()
            Resultados.results.add(4)
            startActivity(intent4)
        })
    }
}