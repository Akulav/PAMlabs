package com.example.pam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        btn2.setOnClickListener {
            val msg = message2.text.toString()
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("primeste",msg)
            startActivity(intent)
        }

        val receivedData = intent.getStringExtra("trimite").toString().toLowerCase()
        window2TextView.setText("Text will be converted to uppercase.\nReceived text is: " + receivedData)
        message2.setText("")

    }
}