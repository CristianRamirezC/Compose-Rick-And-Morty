package com.example.composerickandmorty.domain.model.location

import com.example.composerickandmorty.data.model.location.LocationResponseInfoModel

data class LocationResponseInfo(
    val numberOfLocations: Int,
    val numberOfPages: Int,
    val nextPage: String?,
    val previousPage: String?
)


fun LocationResponseInfoModel.toDomain() = LocationResponseInfo(
    numberOfLocations, numberOfPages, nextPage, previousPage
)