package com.example.infogames.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface VideojuegoDao {
    @Query("SELECT * FROM videojuegos")
    fun obtenerTodos(): Flow<List<Videojuego>>

    @Insert
    suspend fun insertar(videojuego: Videojuego)
}
