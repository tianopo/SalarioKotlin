package com.example.salariobase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular         = findViewById<TextView>(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            //variáveis labels
            var lblSalarioBruto = findViewById<TextView>(R.id.lblSalarioBruto)
            var lblDescISS = findViewById<TextView>(R.id.lblDescISS)
            var lblDescFGTS = findViewById<TextView>(R.id.lblDescFGTS)
            var lblSalarioLiquido = findViewById<TextView>(R.id.lblSalarioLiquido)
            // variáveis txt
            var valorHoraTrabalhada = findViewById<TextView>(R.id.txtValorHoraTrabalhada).text.toString().toFloat()
            var qtdDiasTrabalhados  = findViewById<TextView>(R.id.txtDiasTrabalhados).text.toString().toInt()
            var qtdHorasDias        = findViewById<TextView>(R.id.txtQtdHorasDias).text.toString().toInt()
            //variáveis descontos
            var iss = 0.05
            var fgts = 0.08

            var salarioBruto = qtdHorasDias * qtdDiasTrabalhados * valorHoraTrabalhada
            var descISS = salarioBruto * iss
            var descFGTS = salarioBruto * fgts
            var salarioLiquido = salarioBruto - (descISS + descFGTS)

            lblSalarioBruto.text = "Salário Bruto: ${salarioBruto}"
            lblDescISS.text = "Desc. ISS: ${descISS}"
            lblDescFGTS.text = "Desc. FGTS: ${descFGTS}"
            lblSalarioLiquido.text = "Salário Líquido: ${salarioLiquido}"
        }
    }
}