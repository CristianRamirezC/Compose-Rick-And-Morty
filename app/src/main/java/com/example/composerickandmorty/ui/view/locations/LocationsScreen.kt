package com.example.composerickandmorty.ui.view.locations

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.example.composerickandmorty.domain.model.location.Location
import com.example.composerickandmorty.ui.viewModel.location.LocationViewModel

@Composable
fun LocationsScreen(
    locationViewModel: LocationViewModel
) {
    val locationList: List<Location> by
    locationViewModel.locationList.observeAsState(initial = emptyList())

    LazyColumn(
        modifier = Modifier.fillMaxHeight()
    ) {
        items(items = locationList) { location ->
            LocationCard(location = location)
        }
    }
}