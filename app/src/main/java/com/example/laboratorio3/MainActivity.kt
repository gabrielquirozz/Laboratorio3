package com.example.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import androidx.core.view.isGone

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun IngresarNombre (view: View) {
        val Texto : TextView = findViewById(R.id.textView2)
        val Texto1 : TextView = findViewById(R.id.textView)
        val Nombre : EditText = findViewById(R.id.editText)
        val Barra : ScrollView = findViewById(R.id.Barra)
        val boton1 : Button = findViewById(R.id.button)

        Texto.setText(Nombre.toString())
        Texto1.visibility = View.GONE
        Nombre.visibility = View.GONE
        Texto.visibility = View.VISIBLE








    }
}
