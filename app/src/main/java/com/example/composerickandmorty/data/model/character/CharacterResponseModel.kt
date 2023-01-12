package com.example.composerickandmorty.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterResponseModel(
    @SerializedName("info") val responseInfo: CharacterResponseInfoModel,
    @SerializedName("results") val responseResultsList: List<CharacterModel>
)
