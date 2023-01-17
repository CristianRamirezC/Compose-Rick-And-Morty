package com.example.composerickandmorty.domain.model.character

import com.example.composerickandmorty.data.model.character.CharacterLocationModel
import com.example.composerickandmorty.data.model.character.CharacterModel
import com.google.gson.annotations.SerializedName

data class Character(
    val characterID: Int,
    val characterName: String,
    val characterStatus: String,
    val characterSpecies: String,
    val characterGender: String,
    val characterOrigin: CharacterLocationModel,
    val characterLocation: CharacterLocationModel,
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
    characterOrigin,
    characterLocation,
    characterImage,
)