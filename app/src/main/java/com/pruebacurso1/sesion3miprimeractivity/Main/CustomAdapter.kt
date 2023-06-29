package com.pruebacurso1.sesion3miprimeractivity.Main
import com.pruebacurso1.sesion3miprimeractivity.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(context: Context, private val dataList: ArrayList<String>) : ArrayAdapter<String>(context, R.layout.list_item_layout, dataList)  {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val viewHolder: ViewHolder

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false)
            viewHolder = ViewHolder()
            viewHolder.textView = view.findViewById(R.id.textrecycler)
            view.tag = viewHolder
        } else {
            viewHolder = view.tag as ViewHolder
        }

        val data = dataList[position]
        viewHolder.textView.text = data

        return view!!
    }

    private class ViewHolder {
        lateinit var textView: TextView
    }
}