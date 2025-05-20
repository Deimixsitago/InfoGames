package com.example.infogames.ui.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.infogames.ui.theme.InfoGamesTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import androidx.compose.foundation.background
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen(navController: NavController) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E2E)) // ✅ Paréntesis cerrado
    ) { // ✅ Llave de apertura correcta
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            // Título
            Text(
                text = "Iniciar Sesión",
                style = MaterialTheme.typography.headlineLarge.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 40.dp)
            ) // ✅ Paréntesis cerrado

            // Campo Email
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedLabelColor = Color.LightGray
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            // **Campo Contraseña**
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Contraseña") },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedLabelColor = Color.LightGray
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Botón Login
            Button(
                onClick = {
                    if (email.isBlank() || password.isBlank()) {
                        Toast.makeText(context, "Complete todos los campos", Toast.LENGTH_SHORT).show()
                    } else {
                        loginUser(auth, email, password) { user, error ->
                            if (user != null) {
                                navController.navigate("main_screen")
                            } else {
                                Toast.makeText(context, "Error: ${error ?: "Credenciales inválidas"}", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6200EE)
                )
            ) {
                Text("Ingresar", fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Enlace a Registro
            TextButton(
                onClick = { navController.navigate("register_screen") }
            ) {
                Text(
                    "¿No tienes cuenta? Regístrate",
                    color = Color(0xFF03DAC5),
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

fun loginUser(
    auth: FirebaseAuth,
    email: String,
    password: String,
    onResult: (FirebaseUser?, String?) -> Unit
) {
    auth.signInWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                onResult(auth.currentUser, null)
            } else {
                val errorMessage = task.exception?.message ?: "Unknown error"
                onResult(null, errorMessage)
            }
        }
}


fun funcionLarga2122() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarga121() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}
fun funcionLarg3a1() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarg3a2() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funci4onLarga3() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLarfga4() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcioncLarga5() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionaLarga6() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionrLarga7() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcinonLarga8() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funciconLarga9() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcioxnLarga10() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funzcionLarga11() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun fudncionLarga12() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcioynLarga13() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLaurga14() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }

    println("Fin de funcionLarga1")
}

fun funcionLafrga15() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcisonLarga16() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLargaa17() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLsarga18() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLaxrga19() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}

fun funcionLaerga20() {
    val a = 1
    val b = 2
    val c = a + b
    println("Resultado: $c")
    for (i in 1..5) {
        println("Iteración $i")
    }
    println("Fin de funcionLarga1")
}
