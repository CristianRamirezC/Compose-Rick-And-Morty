package com.example.composerickandmorty.data.network.character

import com.example.composerickandmorty.data.model.character.CharacterModel
import com.example.composerickandmorty.data.model.character.CharacterResponseModel
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

private const val CHARACTER_API_URL: String = "character"

interface CharacterApiClient {
    @GET(CHARACTER_API_URL)
    fun getAllCharacters(): Single<CharacterResponseModel>
}