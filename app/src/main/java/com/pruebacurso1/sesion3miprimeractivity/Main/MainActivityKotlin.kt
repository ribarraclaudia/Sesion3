package com.pruebacurso1.sesion3miprimeractivity.Main

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.pruebacurso1.sesion3miprimeractivity.R

class MainActivityKotlin: Activity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main_kotlin)
    }

    override fun onResume() {
        super.onResume()
        /*  Toast.makeText(this,"hola",Toast.LENGTH_LONG).show()
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse("https://www.google.com")
        startActivity(intent)
    }*/
        val intent = Intent(this,MysecondActivity::class.java)
        startActivity(intent)
    }
}