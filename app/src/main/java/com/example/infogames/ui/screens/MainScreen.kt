package com.example.infogames.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import coil.compose.rememberAsyncImagePainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.infogames.data.Videojuego
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.infogames.network.RetrofitInstance
import androidx.navigation.NavController
import androidx.compose.material3.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.testTag

@Composable
fun GameCard(juego: Videojuego, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 0.dp)
            .testTag("gameItem"),  // <- TAG para los items
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E2E))//Color original 0xFF1E1E2E
    ) {
        Column(modifier = Modifier.padding(start = 16.dp,
            end = 16.dp,
            top = 16.dp)) {
            Image(
                painter = rememberAsyncImagePainter(juego.imagenUrl),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(juego.nombre, style = MaterialTheme.typography.titleLarge, color = Color.White)
            Text(juego.generos, color = Color.LightGray)
            Text(juego.plataformas, color = Color.Gray)
            Text(juego.año, color = Color.LightGray)
            Text("⭐ ${juego.rating}", color = Color.Yellow)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController, modifier: Modifier = Modifier) {
    var juegos by remember { mutableStateOf<List<Videojuego>>(emptyList()) }
    var query by remember { mutableStateOf("") }

        Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "InfoGames",
                        modifier = Modifier.padding(start = 16.dp),
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontWeight = FontWeight.Bold,
                            fontSize = 46.sp
                        )
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1E1E2E),
                    titleContentColor = Color.White
                )
            )
        },
        modifier = modifier
    ) { innerPadding ->
            LaunchedEffect(query) {
                kotlinx.coroutines.delay(500) // debounce para evitar muchas peticiones

                try {
                    val response = RetrofitInstance.api.getGames(
                        apiKey = "076ab5ff6e1c4261a5cfcf7a57cbf2e4",
                        pageSize = if (query.isNotBlank()) 30 else 10,
                        search = query.takeIf { it.isNotBlank() }
                    )

                    juegos = response.results.map {
                        Videojuego(
                            nombre = it.name,
                            generos = it.genres.joinToString { g -> g.name },
                            plataformas = it.platforms.joinToString { p -> p.platform.name },
                            rating = it.rating,
                            año = it.released,
                            imagenUrl = it.background_image
                        )
                    }
                } catch (e: Exception) {
                    Log.e("MainScreen", "Error al buscar juegos: ${e.message}")
                }
            }
        Column(
            modifier = Modifier
                .padding(
                    top = innerPadding.calculateTopPadding() - 8.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        ) {
            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                label = { Text("Buscar juego") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp)
                    .testTag("searchField"),  // <-- este es el tag que necesitas agregar
                singleLine = true
            )


            // Botón de navegación a créditos
            TextButton(
                onClick = { navController.navigate("credits_screen") },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(
                    "Créditos",
                    color = Color(0xFF03DAC5),
                    fontWeight = FontWeight.Medium
                )
            }

            if (query.isEmpty()) {
                Text(
                    text = "Top 10 juegos más populares",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp),
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 22.sp
                    ),
                    textAlign = TextAlign.Center
                )
            }

            LazyColumn {
                items(juegos) { juego ->
                    GameCard(
                        juego = juego,
                        modifier = Modifier.testTag("gameItem")
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }

            }
        }
    }
}


