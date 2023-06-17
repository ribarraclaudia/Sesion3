package com.pruebacurso1.sesion3miprimeractivity.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pruebacurso1.sesion3miprimeractivity.R

class MysecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysecond)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"hola segundo",Toast.LENGTH_LONG).show()
    }
}