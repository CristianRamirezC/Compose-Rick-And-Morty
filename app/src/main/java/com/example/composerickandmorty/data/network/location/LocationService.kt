package com.example.composerickandmorty.data.network.location

import com.example.composerickandmorty.data.model.location.LocationModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocationService @Inject constructor(
    private val api: LocationApiClient
) {
    suspend fun getLocations(): List<LocationModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllLocations()
            response.body() ?: emptyList()
        }
    }
}