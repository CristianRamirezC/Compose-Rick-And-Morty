package com.example.composerickandmorty.domain.model.character

import com.example.composerickandmorty.data.model.character.CharacterResponseInfoModel

data class CharacterResponseInfo(
    val numberOfCharacters: Int,
    val numberOfPages: Int,
    val nextPage: String?,
    val previousPage: String?
)

fun CharacterResponseInfoModel.toDomain() = CharacterResponseInfo(
    numberOfCharacters,
    numberOfPages,
    nextPage,
    previousPage
)
