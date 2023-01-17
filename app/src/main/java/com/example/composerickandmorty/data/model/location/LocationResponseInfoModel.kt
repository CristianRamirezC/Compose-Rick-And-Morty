package com.example.composerickandmorty.data.model.location

import com.google.gson.annotations.SerializedName

data class LocationResponseInfoModel(
    @SerializedName("count")
    val numberOfLocations: Int = 0,
    @SerializedName("pages")
    val numberOfPages: Int = 0,
    @SerializedName("next")
    val nextPage: String = "",
    @SerializedName("prev")
    val previousPage: String = ""
)
