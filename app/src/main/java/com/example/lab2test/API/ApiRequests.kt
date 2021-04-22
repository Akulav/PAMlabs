package com.example.lab2test.API

import retrofit2.Call
import retrofit2.http.GET

interface ApiRequests{
    @GET()
    fun getData(): Call<ipJson>
}