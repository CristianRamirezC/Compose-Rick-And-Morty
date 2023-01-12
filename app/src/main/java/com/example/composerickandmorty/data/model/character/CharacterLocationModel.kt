package com.example.composerickandmorty.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterLocationModel(
    @SerializedName("name") var locationName: String = "",
    @SerializedName("url") var locationUrl: String = ""
)
