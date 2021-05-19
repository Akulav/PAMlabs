 package com.example.lab2test.Login

 import android.content.Intent
 import androidx.appcompat.app.AppCompatActivity
 import android.os.Bundle
 import com.example.lab2test.R
 import com.example.lab2test.OtherActivities.SecondActivity
 import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         login_btn.setOnClickListener(){
             if (checkLogin(username_box.text.toString(), password_box.text.toString()) == false){
                 username_box.setText("WRONG")
             }

             else
             {
                 username_box.setText("PASSED")
             }
         }
     }

     fun checkLogin(user: String, pass: String):Boolean {
         if (user.equals("Catalin") && pass.equals("0504229"))
         {
             val intent = Intent(this, SecondActivity::class.java)
             startActivity(intent)
             return true;
         }

         if (user.equals("") && pass.equals(""))
             {
                 return false;
             }

         else
         {
            return false;
         }

     }
 }
