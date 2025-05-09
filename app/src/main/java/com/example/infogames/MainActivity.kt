package com.example.infogames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.infogames.ui.theme.InfoGamesTheme
import com.example.infogames.data.Videojuego
import com.example.infogames.ui.screens.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InfoGamesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        juegos = listOf(
                            Videojuego( 1,"Elden Ring", "RPG, Acción", "PS5, Xbox Series X, PC", 9.8, "https://shared.fastly.steamstatic.com/store_item_assets/steam/apps/1245620/header.jpg?t=1744748041"),
                            Videojuego(0, "Starfield", "RPG, Aventura Espacial", "Xbox Series X, PC", 9.2, "https://store-images.s-microsoft.com/image/apps.52870.13567343664224659.1eb6fdf9-8a0b-4344-a135-ab17dfa3c609.20ed1644-2c01-4d5a-b636-3d54ac941a1f?q=90&w=480&h=270")
                        ),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InfoGamesTheme {
        Greeting("Android")
    }
}
