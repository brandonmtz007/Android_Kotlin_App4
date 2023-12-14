package com.example.retoradio5f2023


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val r1=findViewById<RadioButton>(R.id.r1)
        val r2=findViewById<RadioButton>(R.id.r2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            try {
                if (r1.isChecked)
                    tv1.text = "Bienvenido: ${et1.text.toString() +" "+ et2.text.toString()+" hombre"}"
                if (r2.isChecked)
                    tv1.text = "Bienvenido: ${et1.text.toString() +" "+ et2.text.toString()+" mujer"}"
            }catch (e:Exception){
                tv1.text = "Error al capturar los datos"
            }
        }
    }
}