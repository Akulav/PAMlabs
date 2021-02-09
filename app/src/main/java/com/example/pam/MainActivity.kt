package com.example.pam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val transmitData = message_original.text.toString()
            val intent = Intent(this,Activity2::class.java)
            intent.putExtra("trimite",transmitData)
            startActivity(intent)
        }

        if(intent.hasExtra("primeste")){
            val receivedData = intent.getStringExtra("primeste").toString().toUpperCase()
            txt.text = "Recevied text is: $receivedData"
        }
        
    }
}
