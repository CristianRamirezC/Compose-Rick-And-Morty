package com.example.composerickandmorty.ui.viewModel.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composerickandmorty.domain.location.GetLocationsUseCase
import com.example.composerickandmorty.domain.model.location.Location
import com.example.composerickandmorty.domain.model.location.LocationResponseInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LocationViewModel @Inject constructor(
    private val getLocationsUseCase: GetLocationsUseCase
) : ViewModel() {

    private var _locationResponseInfo = MutableLiveData<LocationResponseInfo>()
    val locationResponseInfo: LiveData<LocationResponseInfo> = _locationResponseInfo

    private var _locationsList = MutableLiveData<List<Location>>()
    val locationList: LiveData<List<Location>> = _locationsList

    private var _isLocationLoading = MutableLiveData<Boolean>()
    val isLocationLoading: LiveData<Boolean> = _isLocationLoading


    fun onCreate() {

        viewModelScope.launch {
            _isLocationLoading.postValue(true)

            val locations = getLocationsUseCase()

            _locationResponseInfo.postValue(locations.locationResponseInfo)
            _locationsList.postValue(locations.locationResultsList)

            _isLocationLoading.postValue(false)
        }
    }
}