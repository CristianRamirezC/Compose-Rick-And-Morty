package com.example.composerickandmorty.data.network.location

import com.example.composerickandmorty.data.model.location.LocationModel
import retrofit2.Response
import retrofit2.http.GET

private const val LOCATION_API_URL: String = "location"

interface LocationApiClient {
    @GET(LOCATION_API_URL)
    suspend fun getAllLocations(): Response<List<LocationModel>>
}