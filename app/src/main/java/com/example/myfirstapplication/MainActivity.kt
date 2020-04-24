package com.example.myfirstapplication


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listView)
        //val redColor = Color.parseColor("#3F51B5")
        //listView.setBackgroundColor(redColor)

        listView.adapter = MyCustomAdapter(this)
    }

    private class MyCustomAdapter(context: Context): BaseAdapter() {

        private val mContext: Context
        init {
            mContext = context
        }
        override fun getCount(): Int {
            return 5
        }
        override fun getItemId(position: Int): Long {
            return position.toLong()
        }
        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "Rafael Colors Escucha Marshmello"
            return textView
        }
    }
}
