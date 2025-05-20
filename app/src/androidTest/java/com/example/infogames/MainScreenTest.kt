package com.example.infogames

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.testing.TestNavHostController
import com.example.infogames.ui.screens.MainScreen
import org.junit.Rule
import org.junit.Test

class MainScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun search_showsMax30Games_whenQueryHasManyResults() {
        composeTestRule.setContent {
            val navController = TestNavHostController(LocalContext.current)
            MainScreen(navController = navController)
        }

        // Escribir en el campo búsqueda un texto que dispare muchos resultados
        composeTestRule.onNodeWithTag("searchField")
            .performTextInput("Mario")

        // Esperar a que carguen resultados (debe haber al menos 1)
        composeTestRule.waitUntil(
            timeoutMillis = 7000,
            condition = {
                composeTestRule.onAllNodesWithTag("gameItem").fetchSemanticsNodes().isNotEmpty()
            }
        )

        // Verificar que la cantidad máxima de juegos es 30 o menos
        val gamesCount = composeTestRule.onAllNodesWithTag("gameItem").fetchSemanticsNodes().size
        assert(gamesCount <= 30) {
            "Se esperaban máximo 30 juegos, pero se encontraron $gamesCount"
        }
    }

    @Test
    fun borrar_busqueda_showsTop10PopularGames() {
        composeTestRule.setContent {
            val navController = TestNavHostController(LocalContext.current)
            MainScreen(navController = navController)
        }

        // Limpiar campo búsqueda para que quede vacío
        composeTestRule.onNodeWithTag("searchField")
            .performTextClearance()

        // Esperar a que carguen los 10 juegos más populares
        composeTestRule.waitUntil(
            timeoutMillis = 7000,
            condition = {
                composeTestRule.onAllNodesWithTag("gameItem").fetchSemanticsNodes().size <= 10 &&
                        composeTestRule.onAllNodesWithTag("gameItem").fetchSemanticsNodes().isNotEmpty()
            }
        )

        val gamesCount = composeTestRule.onAllNodesWithTag("gameItem").fetchSemanticsNodes().size
        assert(gamesCount <= 10) {
            "Se esperaban máximo 10 juegos populares, pero se encontraron $gamesCount"
        }
    }
}
