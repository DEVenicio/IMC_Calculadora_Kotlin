package com.devenicio.calculadora_imc_dio_bootcamp_everis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         btn_entrar.setOnClickListener {
             openNextActivity()
         }
    }
    private fun openNextActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
