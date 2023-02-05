package com.example.composerickandmorty.domain.model.character

import com.example.composerickandmorty.data.model.character.CharacterModel

data class Character(
    val characterID: Int,
    val characterName: String,
    val characterStatus: String,
    val characterSpecies: String,
    val characterGender: String,
    val characterOrigin: CharacterLocation,
    val characterLocation: CharacterLocation,
    val characterImage: String,
)

//Mapper from CharacterModel (data Layer Model)
// to Character(Domain layer Model)
fun CharacterModel.toDomain() = Character(
    characterID,
    characterName,
    characterStatus,
    characterSpecies,
    characterGender,
    characterOrigin.toDomain(),
    characterLocation.toDomain(),
    characterImage,
)