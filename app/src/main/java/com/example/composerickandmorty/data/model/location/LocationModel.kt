package com.example.composerickandmorty.data.model.location

import com.google.gson.annotations.SerializedName

data class LocationModel(
    @SerializedName("id") var locationId: Int = 0,
    @SerializedName("name") var locationName: String = "",
    @SerializedName("type") var locationType: String = "",
    @SerializedName("dimension") var locationDimension: String = "",

    )
