package com.example.infogames.data

data class VideojuegoResponse(
    val results: List<VideojuegoDTO>
)

data class VideojuegoDTO(
    val name: String,
    val rating: Double,
    val background_image: String,
    val genres: List<Genre>,
    val platforms: List<PlatformWrapper>,
    val released: String
)

data class Genre(val name: String)
data class PlatformWrapper(val platform: Platform)
data class Platform(val name: String)
