package com.cdp.quizfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Resultado : AppCompatActivity() {

    var correctas=ArrayList<Int>()
    lateinit var labelContador:TextView
    lateinit var denuevo:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        labelContador = findViewById(R.id.label_re)
        denuevo = findViewById(R.id.btnReintentar)
        denuevo = findViewById(R.id.btnReintentar)

        correctas.add(1)
        correctas.add(2)
        correctas.add(3)
        correctas.add(4)
        correctas.add(2)

       for (i in Resultados.results){
            if (Resultados.results[i] == correctas[i]){
                Resultados.contRespCor++
            }else{
                Resultados.contRespCor = Resultados.contRespCor
            }
        }

        labelContador.setText(Resultados.contRespCor.toString())

        denuevo.setOnClickListener({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })

    }
}