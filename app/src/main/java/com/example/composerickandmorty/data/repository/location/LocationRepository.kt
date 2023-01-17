package com.example.composerickandmorty.data.repository.location

import com.example.composerickandmorty.data.model.location.LocationResponseModel
import com.example.composerickandmorty.data.network.location.LocationService
import com.example.composerickandmorty.domain.model.location.LocationResponse
import com.example.composerickandmorty.domain.model.location.toDomain
import javax.inject.Inject

class LocationRepository @Inject constructor(
    private val api: LocationService
) {
    suspend fun getAllLocations(): LocationResponse {
        //mapping LocationModel into Location (Data layer to Domain layer)
        return api.getLocations().toDomain()
    }
}