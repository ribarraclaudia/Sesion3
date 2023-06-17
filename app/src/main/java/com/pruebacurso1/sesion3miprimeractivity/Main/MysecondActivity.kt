package com.pruebacurso1.sesion3miprimeractivity.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.pruebacurso1.sesion3miprimeractivity.R

class MysecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysecond)

        val textView= findViewById<TextView>(R.id.contadortv)
        val button = findViewById<Button>(R.id.button)

        var counter=0

        button.setOnClickListener {
            counter++
            textView.text=counter.toString()
        }
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Comenzando segundo activity",Toast.LENGTH_LONG).show()
    }
}