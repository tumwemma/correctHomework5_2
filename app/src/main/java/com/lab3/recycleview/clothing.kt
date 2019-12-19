package com.lab3.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clothing_cat_list.*

class clothing : AppCompatActivity() {

    var clothing = arrayOf<String>("T-Shirt", "Socks", "Trousers", "Jackets", "Shoes")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothing_cat_list)
        val adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, clothing)
        clothesList.adapter = adapter


        clothesList.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val item = parent.getItemAtPosition(position).toString()
                if (position === 0)
                    Toast.makeText(
                        this,
                        "we have Long sleeve and short sleeve T-shirts ",
                        Toast.LENGTH_SHORT).show()

                if (position === 1)
                    Toast.makeText(this, "we have winter and Summer Socks ", Toast.LENGTH_SHORT).show()
                if (position == 2)
                    Toast.makeText(
                        this, "we have Gentle trouser,Jeans, and cotton ones ", Toast.LENGTH_SHORT).show()
                if (position==3)
                    Toast.makeText(this,"we have winter and Summer Jackets ", Toast.LENGTH_SHORT).show()
                if (position==4)
                    Toast.makeText(this,"we have winter and Summer Shoes ", Toast.LENGTH_SHORT).show()

            }
    }
}
