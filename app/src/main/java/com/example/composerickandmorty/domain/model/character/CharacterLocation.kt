package com.example.composerickandmorty.domain.model.character

import com.example.composerickandmorty.data.model.character.CharacterLocationModel

data class CharacterLocation(
    val locationName: String,
    val locationUrl: String
)

fun CharacterLocationModel.toDomain() = CharacterLocation(
    locationName, locationUrl
)
