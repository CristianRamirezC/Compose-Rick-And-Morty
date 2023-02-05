package com.example.composerickandmorty.data.network.character

import android.util.Log
import com.example.composerickandmorty.data.model.character.CharacterModel
import com.example.composerickandmorty.data.model.character.CharacterResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CharacterService @Inject constructor(
    private val api: CharacterApiClient
) {
    suspend fun getCharacters(): CharacterResponseModel {
        return withContext(Dispatchers.IO) {
            api.getAllCharacters().body() ?: CharacterResponseModel()
        }
    }
}