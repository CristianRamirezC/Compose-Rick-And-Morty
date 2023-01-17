package com.example.composerickandmorty.domain.location

import com.example.composerickandmorty.data.repository.location.LocationRepository
import com.example.composerickandmorty.domain.model.location.Location
import com.example.composerickandmorty.domain.model.location.LocationResponse
import javax.inject.Inject

class GetLocationsUseCase @Inject constructor(
    private val repository: LocationRepository
) {
    suspend operator fun invoke(): LocationResponse {
         return repository.getAllLocations()
    }
}