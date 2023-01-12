package com.example.composerickandmorty.data.model.location

import com.google.gson.annotations.SerializedName

data class LocationResponseInfoModel(
    @SerializedName("count") var numberOfLocations: Int = 0,
    @SerializedName("pages") var numberOfPages: Int = 0,
    @SerializedName("next") var nextPage: String = "",
    @SerializedName("prev") var previousPage: String = ""
)
