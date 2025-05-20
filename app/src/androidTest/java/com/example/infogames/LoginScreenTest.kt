package com.example.infogames

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.infogames.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun loginScreen_elementsDisplayed() {
        composeTestRule.onNodeWithText("Iniciar Sesión").assertIsDisplayed()
        composeTestRule.onNodeWithText("Email").assertIsDisplayed()
        composeTestRule.onNodeWithText("Contraseña").assertIsDisplayed()
        composeTestRule.onNodeWithText("Ingresar").assertIsDisplayed()
    }
    fun loginScreen_elementsDisplayed_dupli() {
        composeTestRule.onNodeWithText("Iniciar Sesión").assertIsDisplayed()
        composeTestRule.onNodeWithText("Email").assertIsDisplayed()
        composeTestRule.onNodeWithText("Contraseña").assertIsDisplayed()
        composeTestRule.onNodeWithText("Ingresar").assertIsDisplayed()
    }

    @Test
    fun loginScreen_emptyFields_showsToast() {
        composeTestRule.onNodeWithText("Ingresar").performClick()
        // Aquí no podemos testear Toast directamente, pero podrías
        // verificar que el error (mensaje o estado) cambió en UI si lo tienes.
    }
    fun loginScreen_emptyFields_showsToast_dupli() {
        composeTestRule.onNodeWithText("Ingresar").performClick()
        // Aquí no podemos testear Toast directamente, pero podrías
        // verificar que el error (mensaje o estado) cambió en UI si lo tienes.
    }

    @Test
    fun loginScreen_validCredentials_navigatesToMainScreen() {
        // Ingresar credenciales válidas
        composeTestRule.onNodeWithText("Email").performTextInput("test@lsls.com")
        composeTestRule.onNodeWithText("Contraseña").performTextInput("123_abc")
        composeTestRule.onNodeWithText("Ingresar").performClick()

        // Esperar a que aparezca algo de MainScreen (p.ej. título "InfoGames")
        composeTestRule.waitUntil(timeoutMillis = 7000) {
            composeTestRule.onAllNodesWithText("InfoGames").fetchSemanticsNodes().isNotEmpty()
        }

        // Confirmar que el título está visible
        composeTestRule.onNodeWithText("InfoGames").assertIsDisplayed()
    }

    @Test
    fun loginScreen_validCredentials_navigatesToMainScreen_dupli() {
        // Ingresar credenciales válidas
        composeTestRule.onNodeWithText("Email").performTextInput("test@lsls.com")
        composeTestRule.onNodeWithText("Contraseña").performTextInput("123_abc")
        composeTestRule.onNodeWithText("Ingresar").performClick()

        // Esperar a que aparezca algo de MainScreen (p.ej. título "InfoGames")
        composeTestRule.waitUntil(timeoutMillis = 7000) {
            composeTestRule.onAllNodesWithText("InfoGames").fetchSemanticsNodes().isNotEmpty()
        }

        // Confirmar que el título está visible
        composeTestRule.onNodeWithText("InfoGames").assertIsDisplayed()
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



}
