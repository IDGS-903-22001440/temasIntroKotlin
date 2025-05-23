package com.IanAquino.introkotlin903.Practica4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.IanAquino.introkotlin903.R
import android.widget.Button
import android.widget.TextView
import android.widget.EditText


class ArchivoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_archivo)
        val btnGuardar = findViewById<Button>(R.id.saveButton)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val outputText = findViewById<TextView>(R.id.outputText)
        val inputText = findViewById<EditText>(R.id.inputText)

        btnGuandar.setOnClicklistener{
            val texto = inputText.text.toString()+""
            try{
                openFileOutput("datos.txt", Mode)
            }

        }

        btnLeer.setOnClickListener

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}