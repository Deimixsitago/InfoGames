package com.example.infogames.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "videojuegos")
data class Videojuego(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val generos: String,
    val plataformas: String,
    val rating: Double,
    val imagenUrl: String,
    val año: String
)
