package com.example.composerickandmorty.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterLocationModel(
    @SerializedName("name") val locationName: String = "",
    @SerializedName("url") val locationUrl: String = ""
)
