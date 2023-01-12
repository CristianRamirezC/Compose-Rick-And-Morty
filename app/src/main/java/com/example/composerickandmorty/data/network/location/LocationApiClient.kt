package com.example.composerickandmorty.data.network.location

import com.example.composerickandmorty.data.model.location.LocationModel
import retrofit2.Response
import retrofit2.http.GET

interface LocationApiClient {
    @GET("location")
    suspend fun getAllLocations(): Response<List<LocationModel>>
}