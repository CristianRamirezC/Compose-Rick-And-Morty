package com.example.composerickandmorty.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterResponseInfoModel(
    @SerializedName("count")
    val numberOfCharacters: Int = 0,
    @SerializedName("pages")
    val numberOfPages: Int = 0,
    @SerializedName("next")
    val nextPage: String = "",
    @SerializedName("prev")
    val previousPage: String = ""
)
