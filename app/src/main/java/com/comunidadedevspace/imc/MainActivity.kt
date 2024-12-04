package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar um variavel e associar o componente de UI <EditText>
        // Recuperar o botão da tela
        // Colocar ação no botao
        // Recuperar o texto digitado no edt peso - Log
        // Recuperar o texto digitado no edt altura - Log

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text
            println("Acao do botao " + peso)
            val altura = edtAltura.text
            println("acao do botao " + altura)

        }



    }

}