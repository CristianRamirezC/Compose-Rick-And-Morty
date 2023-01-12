package com.example.composerickandmorty.ui.view.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composerickandmorty.ui.view.characters.CharactersScreen
import com.example.composerickandmorty.ui.view.episodes.EpisodesScreen
import com.example.composerickandmorty.ui.view.locations.LocationsScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Characters.screenRoute
    ) {
        composable(route = BottomNavItem.Characters.screenRoute) {
            CharactersScreen()
        }

        composable(route = BottomNavItem.Episodes.screenRoute) {
            EpisodesScreen()
        }

        composable(route = BottomNavItem.Locations.screenRoute) {
            LocationsScreen()
        }
    }
}

