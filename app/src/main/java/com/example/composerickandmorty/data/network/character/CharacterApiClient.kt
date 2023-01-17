package com.example.composerickandmorty.data.network.character

import com.example.composerickandmorty.data.model.character.CharacterModel
import com.example.composerickandmorty.data.model.character.CharacterResponseModel
import retrofit2.Response
import retrofit2.http.GET

private const val CHARACTER_API_URL: String = "character"

interface CharacterApiClient {
    @GET(CHARACTER_API_URL)
    suspend fun getAllCharacters(): Response<CharacterResponseModel>
}