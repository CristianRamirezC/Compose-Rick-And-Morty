package com.example.composerickandmorty.domain.model.location

import com.example.composerickandmorty.data.model.location.LocationModel
import com.google.gson.annotations.SerializedName

data class Location(
    val locationId: Int,
    val locationName: String,
    val locationType: String,
    val locationDimension: String,
)


//Mapper from LocationModel (Data Layer) to Location (Domain Layer)
fun LocationModel.toDomain() = Location(
    locationId,
    locationName,
    locationType,
    locationDimension
)
