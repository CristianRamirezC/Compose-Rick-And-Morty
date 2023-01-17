package com.example.composerickandmorty.ui.viewModel.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.composerickandmorty.domain.location.GetLocationsUseCase
import com.example.composerickandmorty.domain.model.location.Location
import com.example.composerickandmorty.domain.model.location.LocationResponseInfo
import javax.inject.Inject

class LocationViewModel @Inject constructor(
    private val getLocationsUseCase: GetLocationsUseCase
) : ViewModel() {

    private var _locationResponseInfo = MutableLiveData<LocationResponseInfo>()
    val locationResponseInfo: LiveData<LocationResponseInfo> = _locationResponseInfo

    private var _locationsList = MutableLiveData<List<Location>>()
    val locationList: LiveData<List<Location>> = _locationsList
}