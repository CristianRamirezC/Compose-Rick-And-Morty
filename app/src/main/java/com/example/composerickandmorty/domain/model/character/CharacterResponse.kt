package com.example.composerickandmorty.domain.model.character

import com.example.composerickandmorty.data.model.character.CharacterResponseModel

data class CharacterResponse(
    val responseInfo: CharacterResponseInfo,
    val responseResultsList: List<Character>
)

fun CharacterResponseModel.toDomain() = CharacterResponse(
    responseInfo.toDomain(),
    responseResultsList.map { characterModel ->
        characterModel.toDomain()
    }
)
