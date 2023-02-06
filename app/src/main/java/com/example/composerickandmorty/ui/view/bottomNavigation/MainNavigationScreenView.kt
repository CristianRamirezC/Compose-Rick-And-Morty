package com.example.composerickandmorty.ui.view.bottomNavigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.composerickandmorty.ui.viewModel.character.CharacterViewModel
import com.example.composerickandmorty.ui.viewModel.episode.EpisodeViewModel
import com.example.composerickandmorty.ui.viewModel.location.LocationViewModel

@Composable
fun MainNavigationScreenView(
    characterViewModel: CharacterViewModel,
    episodeViewModel: EpisodeViewModel,
    locationViewModel: LocationViewModel
) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { MyBottomNavigation(navController = navController) }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            NavigationGraph(
                navController = navController,
                characterViewModel = characterViewModel,
                episodeViewModel = episodeViewModel,
                locationViewModel = locationViewModel
            )
        }
    }
}