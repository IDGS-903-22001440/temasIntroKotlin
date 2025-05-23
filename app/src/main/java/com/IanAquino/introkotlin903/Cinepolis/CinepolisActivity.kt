package com.IanAquino.introkotlin903.Cinepolis

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.IanAquino.introkotlin903.R
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.Button
import android.widget.TextView


class CinepolisActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etCompradores: EditText
    private lateinit var etBoletos: EditText
    private lateinit var rgTarjeta: RadioGroup
    private lateinit var rbSi: RadioButton
    private lateinit var rbNo: RadioButton
    private lateinit var btnCalcular: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinepolis)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etNombre = findViewById(R.id.etNombre)
        etCompradores = findViewById(R.id.etCompradores)
        etBoletos = findViewById(R.id.etBoletos)
        rgTarjeta = findViewById(R.id.rgTarjeta)
        rbSi = findViewById(R.id.rbSi)
        rbNo = findViewById(R.id.rbNo)
        btnCalcular = findViewById(R.id.btnCalcular)
        tvResultado = findViewById(R.id.tvResultado)

        btnCalcular.setOnClickListener {
            calcularTotal()
        }
    }

    private fun calcularTotal() {
        try {
            val compradores = etCompradores.text.toString().toInt()
            val boletos = etBoletos.text.toString().toInt()

            if (boletos > compradores * 7) {
                tvResultado.text = "Máximo 7 boletos por comprador."
                return
            }

            val precio = boletos * 12.0
            var descuento = 0.0


            descuento += when {
                boletos >= 6 -> 0.15
                boletos in 3..5 -> 0.10
                else -> 0.0
            }


            if (rbSi.isChecked) {
                descuento += 0.10
            }

            val total = precio * (1 - descuento)
            tvResultado.text = "Total a pagar: $%.2f".format(total)

        } catch (e: Exception) {
            tvResultado.text = "Por favor, completa todos los campos correctamente."
        }
    }
}