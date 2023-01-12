package com.example.composerickandmorty.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    @SerializedName("id") var characterID: Int = 0,
    @SerializedName("name") var characterName: String = "",
    @SerializedName("status") var characterStatus: String = "",
    @SerializedName("species") var characterSpecies: String = "",
    @SerializedName("gender") var characterGender: String = "",
    @SerializedName("origin") var characterOrigin: CharacterLocationModel,
    @SerializedName("location") var characterLocation: CharacterLocationModel,
    @SerializedName("Image") var characterImage: String = "",
    @SerializedName("episode") var characterEpisodesList: List<String>
)
