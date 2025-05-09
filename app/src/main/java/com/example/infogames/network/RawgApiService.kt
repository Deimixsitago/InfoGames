package com.example.infogames.network

import com.example.infogames.data.VideojuegoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RawgApiService {
    @GET("games")
    suspend fun getGames(
        @Query("key") apiKey: String,
        @Query("page_size") pageSize: Int = 10,
        @Query("search") search: String? = null
    ): VideojuegoResponse}
