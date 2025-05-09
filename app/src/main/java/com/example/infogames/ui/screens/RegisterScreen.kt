package com.example.infogames.ui.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser 

@Composable
fun RegisterScreen(navController: NavController) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(value = email.value, onValueChange = { email.value = it }, label = { Text("Email") })
        TextField(value = password.value, onValueChange = { password.value = it }, label = { Text("Password") }, visualTransformation = PasswordVisualTransformation())

        Button(onClick = {
            registerUser (auth, email.value, password.value) { user, error ->
                if (user != null) {
                    Toast.makeText(context, "Registration successful! Welcome ${user.email}", Toast.LENGTH_SHORT).show()
                    navController.navigate("main_screen") // Navigate to home screen after registration
                } else {
                    Toast.makeText(context, error ?: "Error", Toast.LENGTH_SHORT).show()
                }
            }
        }) {
            Text("Register")
        }
    }
}

fun registerUser(
    auth: FirebaseAuth,
    email: String,
    password: String,
    onResult: (FirebaseUser?, String?) -> Unit
) {
    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                onResult(auth.currentUser, null)
            } else {
                val errorMessage = task.exception?.message ?: "Unknown error"
                onResult(null, errorMessage)
            }
        }
}

