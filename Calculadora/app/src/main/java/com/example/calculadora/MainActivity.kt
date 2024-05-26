package com.example.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private val calc = Calculadora()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val number1 = etNumber1.text.toString().toIntOrNull()
            val number2 = etNumber2.text.toString().toIntOrNull()

            if (number1 != null && number2 != null) {
                val sum = calc.add(number1, number2)
                tvResult.text = "Resultado: $sum"
            } else {
                tvResult.text = "Apenas numeros são validos"
            }
        }
    }
}