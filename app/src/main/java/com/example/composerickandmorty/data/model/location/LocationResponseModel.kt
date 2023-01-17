package com.example.composerickandmorty.data.model.location

import com.google.gson.annotations.SerializedName

data class LocationResponseModel(
    @SerializedName("info") val locationResponseInfoModel: LocationResponseInfoModel,
    @SerializedName("results") val locationResultsList: List<LocationModel>
)
