package com.example.composerickandmorty.data.model.location

import com.google.gson.annotations.SerializedName

data class LocationResponseModel(
    @SerializedName("info") var locationResponseInfoModel: LocationResponseInfoModel,
    @SerializedName("results") var locationResultsList: List<LocationModel>
)
