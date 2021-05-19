package com.example.lab2test.Login

import androidx.test.espresso.action.ViewActions.click
import com.example.lab2test.R
import junit.framework.TestCase
import org.junit.Test

class LoginUITestClick : TestCase(){
    @Test
    fun checkClick(){
        login = MainActivity.findViewById(R.id.login_btn);
        assertEquals(MainActivity.findViewById(R.id.username_box),"WRONG");
    }
}