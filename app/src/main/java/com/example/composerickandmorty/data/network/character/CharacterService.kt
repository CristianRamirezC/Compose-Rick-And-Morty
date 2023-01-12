package com.example.composerickandmorty.data.network.character

import com.example.composerickandmorty.data.model.character.CharacterModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CharacterService @Inject constructor(
    private val api: CharacterApiClient
) {
    suspend fun getCharacters(): List<CharacterModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllCharacters()
            response.body() ?: emptyList()
        }
    }
}