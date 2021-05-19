package com.example.lab2test.Login

import junit.framework.TestCase
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.concurrent.ThreadLocalRandom

private val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
class LoginTest : TestCase()
{


    @Test
    fun checkEmpty(){
        val userName = ""
        val password = ""
        assertThat(MainActivity.checkLogin(userName, password)).isFalse()
    }

    @Test
    fun checkWrong(){
        val userName = ThreadLocalRandom.current()
            .ints(10, 0, charPool.size)
            .asSequence()
            .map(charPool::get)
            .joinToString("")
        val password = ThreadLocalRandom.current()
            .ints(11, 0, charPool.size)
            .asSequence()
            .map(charPool::get)
            .joinToString("")
        assertThat(MainActivity.checkLogin(userName, password)).isFalse())
    }

    @Test
    fun checkEmpty(){
        val userName = "catalin"
        val password = "0504229"
        assertThat(MainActivity.checkLogin(userName, password)).isTrue()
    }

}