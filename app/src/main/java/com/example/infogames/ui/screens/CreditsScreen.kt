package com.example.infogames.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreditsScreen(navController: NavController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Créditos") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Volver",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1E1E2E),
                    titleContentColor = Color.White
                )
            )
        },
        containerColor = Color(0xFF1E1E2E),
        modifier = modifier
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(24.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("InfoGames App", style = MaterialTheme.typography.headlineSmall, color = Color.White)
            Text("Desarrollado por David Zapata Obando y Simón Támara Gómez ", color = Color.LightGray)
            Text("Bibliotecas utilizadas:", style = MaterialTheme.typography.titleMedium, color = Color.White)
            Text("- Jetpack Compose", color = Color.LightGray)
            Text("- Retrofit", color = Color.LightGray)
            Text("- Coil", color = Color.LightGray)
            Text("- RAWG Video Games Database API", color = Color.LightGray)
            Spacer(modifier = Modifier.height(32.dp))
            Text("Gracias por usar esta app ❤️", color = Color.White)
        }
    }
}

fun funcionLarga212() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga21() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}
fun funcionLarga1() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga2() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga3() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga4() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga5() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga6() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga7() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga8() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga9() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga10() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga11() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga12() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga13() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga14() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga15() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga16() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga17() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga18() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga19() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga20() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}
