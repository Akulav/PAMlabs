package com.example.lab2test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*
import java.lang.Math

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val exampleList = generateList((5..20).random())

        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)


        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener{
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }


    }

    private fun generateList(size: Int): List<ExampleItem>{

        val list = ArrayList<ExampleItem>()

        for (i in 0 until size ) {
            val drawable = when (i % 5){
                0 -> R.drawable.csgo2
                1 -> R.drawable.lol
                2 -> R.drawable.dota2
                3 -> R.drawable.dota22
                else -> R.drawable.csgo
            }

            var f = (5..5000).random()

            val item = ExampleItem(drawable, "Price is $f. Check description for more info","NON-REFUNDABLE")
            list += item
        }
        return list
    }



}