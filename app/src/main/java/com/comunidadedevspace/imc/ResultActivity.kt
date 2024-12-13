package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val key_result_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(key_result_IMC, 0f)

        val tvresult = findViewById<TextView>(R.id.tvresult)
        val tvclassificacao = findViewById<TextView>(R.id.tv_classificacao)

        tvresult.text = result.toString()


        val classificacao: String = if (result <= 18.5f) {
            "Magreza"
        } else if (result > 18.5f && result <= 24.9f) {
            "Normal"
        } else if (result > 25 && result <= 29.9f) {
            "Sobrepeso"
        } else if (result > 30 && result <= 39.9f) {
            "Obesidade"
        } else {
            "Obesidade Grave"
        }


        tvclassificacao.text= classificacao


    }
}

