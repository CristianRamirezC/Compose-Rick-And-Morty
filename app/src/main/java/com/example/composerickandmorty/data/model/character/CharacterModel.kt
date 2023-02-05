package com.example.composerickandmorty.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    @SerializedName("id")
    val characterID: Int = 0,
    @SerializedName("name")
    val characterName: String = "",
    @SerializedName("status")
    val characterStatus: String = "",
    @SerializedName("species")
    val characterSpecies: String = "",
    @SerializedName("gender")
    val characterGender: String = "",
    @SerializedName("origin")
    val characterOrigin: CharacterLocationModel = CharacterLocationModel(),
    @SerializedName("location")
    val characterLocation: CharacterLocationModel = CharacterLocationModel(),
    @SerializedName("image")
    val characterImage: String = "",
)
