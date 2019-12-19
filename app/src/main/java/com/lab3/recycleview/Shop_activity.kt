package com.lab3.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping_activity.*

class Shop_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_activity)

        var intent=getIntent()

        val output = intent.getStringExtra("name")
        userinfo.text="Welcome $output"
        val iv_click_me1 = findViewById(R.id.imageView1) as ImageView
        iv_click_me1.setOnClickListener{
            Toast.makeText(this, "You have chosen the Electronics category of shopping", Toast.LENGTH_SHORT).show()

        }
        val iv_click_me2 = findViewById(R.id.imageView2) as ImageView
        iv_click_me2.setOnClickListener{
            val shppingIntent = Intent(this, clothing::class.java)

            startActivity(shppingIntent);
            //Toast.makeText(this, "You have chosen the Clothing category of shopping", Toast.LENGTH_SHORT).show()
        }
        val iv_click_me3 = findViewById(R.id.imageView3) as ImageView
        iv_click_me3.setOnClickListener{
            Toast.makeText(this, "You have chosen the Beauty category of shopping", Toast.LENGTH_SHORT).show()
        }
        val iv_click_me = findViewById(R.id.imageView4) as ImageView
        iv_click_me.setOnClickListener{
            Toast.makeText(this, "You have chosen the Food category of shopping", Toast.LENGTH_SHORT).show()
        }

    }

}
