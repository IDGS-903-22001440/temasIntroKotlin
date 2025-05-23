package com.IanAquino.introkotlin903.practica1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.IanAquino.introkotlin903.Cinepolis.CinepolisActivity
import com.IanAquino.introkotlin903.Practica3.Ejemplo3Activity
import com.IanAquino.introkotlin903.R

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSaludo= findViewById<Button>(R.id.btn1)

        btnSaludo.setOnClickListener { navegateToSaludo() }

        val btnCine= findViewById<Button>(R.id.btn3)

        btnCine.setOnClickListener { navegateToCine() }

        val btnEjemplo= findViewById<Button>(R.id.btn4)

        btnEjemplo.setOnClickListener { navegateToEjemplo3() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToSaludo(){
        val intent = Intent(this, saludoActivity::class.java)
        startActivity(intent)
    }
    private fun navegateToCine(){
        val intent = Intent(this, CinepolisActivity::class.java)
        startActivity(intent)
    }
    private fun navegateToEjemplo3(){
        val intent = Intent(this, Ejemplo3Activity::class.java)
        startActivity(intent)
    }

}