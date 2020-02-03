package com.example.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }



    fun  Mensaje (v: View) {
        val mensaje = editText3.getText().toString()
        val intent = Intent(v.context, MainActivity::class.java)
        startActivityForResult(intent, 0)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}
