package com.example.composerickandmorty.domain.model.character

import com.example.composerickandmorty.data.model.character.CharacterModel
import com.example.composerickandmorty.data.model.character.CharacterResponseInfoModel
import com.example.composerickandmorty.data.model.character.CharacterResponseModel
import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    val responseInfo: CharacterResponseInfo,
    val responseResultsList: List<Character>
)

fun CharacterResponseModel.toDomain() = CharacterResponse(
    responseInfo.toDomain(),
    responseResultsList.map {
        it.toDomain()
    }
)
