package com.example.infogames.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: RawgApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.rawg.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RawgApiService::class.java)
    }
}
