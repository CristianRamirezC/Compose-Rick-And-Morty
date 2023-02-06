package com.example.composerickandmorty.ui.view.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composerickandmorty.ui.view.characters.CharactersScreen
import com.example.composerickandmorty.ui.view.episodes.EpisodesScreen
import com.example.composerickandmorty.ui.view.locations.LocationsScreen
import com.example.composerickandmorty.ui.viewModel.character.CharacterViewModel
import com.example.composerickandmorty.ui.viewModel.episode.EpisodeViewModel
import com.example.composerickandmorty.ui.viewModel.location.LocationViewModel

@Composable
fun NavigationGraph(
    navController: NavHostController,
    characterViewModel: CharacterViewModel,
    episodeViewModel: EpisodeViewModel,
    locationViewModel: LocationViewModel
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Characters.screenRoute
    ) {
        composable(route = BottomNavItem.Characters.screenRoute) {
            CharactersScreen(characterViewModel)
        }

        composable(route = BottomNavItem.Episodes.screenRoute) {
            EpisodesScreen(episodeViewModel)
        }

        composable(route = BottomNavItem.Locations.screenRoute) {
            LocationsScreen(locationViewModel)
        }
    }
}

