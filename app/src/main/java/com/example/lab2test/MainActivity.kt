 package com.example.lab2test

 import android.content.Intent
 import androidx.appcompat.app.AppCompatActivity
 import android.os.Bundle
 import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         login_btn.setOnClickListener(){
             if(username_box.text.toString().equals("Catalin")
                 &&password_box.text.toString().equals("0504229")){
                 val intent = Intent(this, SecondActivity::class.java)
                 startActivity(intent)
             }
             else "FATAL ERROR 999"
         }
     }
 }
