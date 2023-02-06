package com.example.composerickandmorty.ui.view.locations

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.composerickandmorty.ui.viewModel.location.LocationViewModel

@Composable
fun LocationsScreen(
    locationViewModel: LocationViewModel
) {
    Text(text = "Locations Screen")
}