package com.devenicio.calculadora_imc_dio_bootcamp_everis

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*
import java.text.DecimalFormat

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        class DecimalFormat
        val dec = DecimalFormat("#,###.00")

        buttonCalcular.setOnClickListener { it: View? ->
            val peso = textInputEditTextPeso.text.toString().toFloat()
            val altura = textInputEditTextAltura.text.toString().toFloat()

            val imc = (peso / (altura * altura))

            when {
                imc <= 18.5 -> {
                    resultado.text = "Seu IMC é ${dec.format(imc)}"
                    resultado.setTextColor(resources.getColor(R.color.abaixoDoPeso))
                }
                imc in 18.5f..25f -> {
                    resultado.text = "Seu IMC é ${dec.format(imc)}"
                    resultado.setTextColor(resources.getColor(R.color.pesoNormal))
                }
                imc in 25f..30f -> {
                    resultado.text = "Seu IMC é ${dec.format(imc)}"
                    resultado.setTextColor(resources.getColor(R.color.Sobrepeso))
                }
                imc in 30f..40f -> {
                    resultado.text = "Seu IMC é ${dec.format(imc)}"
                    resultado.setTextColor(resources.getColor(R.color.obesidadeModerada))
                }
                imc > 40 -> {
                    resultado.text = "Seu imc é ${dec.format(imc)}"
                    resultado.setTextColor(resources.getColor(R.color.obesidadeMorbida))
                }
            }
        }
    }
}




