package com.example.composerickandmorty.data.network.location

import com.example.composerickandmorty.data.model.location.LocationModel
import com.example.composerickandmorty.data.model.location.LocationResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocationService @Inject constructor(
    private val api: LocationApiClient
) {
    suspend fun getLocations(): LocationResponseModel {
        return withContext(Dispatchers.IO) {
            api.getAllLocations().body() ?: LocationResponseModel()
        }
    }
}