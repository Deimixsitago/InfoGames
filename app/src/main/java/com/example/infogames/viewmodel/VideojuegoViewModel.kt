package com.example.infogames.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.infogames.data.AppDatabase
import com.example.infogames.data.Videojuego
import kotlinx.coroutines.launch

class VideojuegoViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = AppDatabase.getDatabase(application).videojuegoDao()
    val videojuegos: LiveData<List<Videojuego>> = dao.obtenerTodos().asLiveData()

    fun insertar(videojuego: Videojuego) {
        viewModelScope.launch {
            dao.insertar(videojuego)
        }
    }
}
