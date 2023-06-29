package com.pruebacurso1.sesion3miprimeractivity.Main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.pruebacurso1.sesion3miprimeractivity.R
import android.widget.ListView
import android.widget.CheckBox
import android.widget.RadioGroup

class MysecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysecond)

        val textView= findViewById<TextView>(R.id.contadortv)
        val button = findViewById<Button>(R.id.button)
        val checkBox = findViewById<CheckBox>(R.id.checkbox1)
        val  radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        //val listView = findViewById<ListView>(R.id.listView)
        // esto es lo nuevo agregado
        val dataList = arrayListOf("Elemento 1", "Elemento 2", "Elemento 3")

        val adapter = CustomAdapter(this, dataList)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter


        var counter=0

        button.setOnClickListener {
            counter++
            textView.text=counter.toString()
        }

        /*
        // Crear una lista de elementos
        val elementos = arrayOf("Elemento 1", "Elemento 2", "Elemento 3")

        // Crear un adaptador para el ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, elementos)

        // Establecer el adaptador en el ListView
        listView.adapter = adapter  */
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            Toast.makeText(this,"Segundo Boton",Toast.LENGTH_LONG).show()
        }


        checkBox.setOnCheckedChangeListener{ buttonView, isChecked->
            if(isChecked){
                button.visibility = View.VISIBLE

            }else{
                button.visibility = View.GONE
            }

        }
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Comenzando segundo activity",Toast.LENGTH_LONG).show()
    }



}