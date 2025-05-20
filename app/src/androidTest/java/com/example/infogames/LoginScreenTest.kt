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

    @Test
    fun loginScreen_emptyFields_showsToast() {
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
}
