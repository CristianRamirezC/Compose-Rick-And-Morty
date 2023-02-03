package com.example.composerickandmorty.domain.model.location

import com.example.composerickandmorty.data.model.location.LocationModel
import com.example.composerickandmorty.data.model.location.LocationResponseInfoModel
import com.example.composerickandmorty.data.model.location.LocationResponseModel
import com.google.gson.annotations.SerializedName

data class LocationResponse(
    val locationResponseInfo: LocationResponseInfo,
    val locationResultsList: List<Location>
)

fun LocationResponseModel.toDomain() = LocationResponse(
    locationResponseInfoModel.toDomain(),
    locationResultsList.map {
        it.toDomain()
    }
)