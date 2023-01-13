package com.example.composerickandmorty.data.repository.location

import com.example.composerickandmorty.data.model.location.LocationModel
import com.example.composerickandmorty.data.network.location.LocationService
import com.example.composerickandmorty.domain.model.location.Location
import com.example.composerickandmorty.domain.model.location.toDomain
import javax.inject.Inject

class LocationRepository @Inject constructor(
    private val api: LocationService
) {
    suspend fun getAllLocations(): List<Location> {
        val locationsFromApi: List<LocationModel> = api.getLocations()
        //mapping LocationModel into Location (Data layer to Domain layer)
        return locationsFromApi.map { it.toDomain() }
    }
}