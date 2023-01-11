package com.example.composerickandmorty.ui.view.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composerickandmorty.ui.view.characters.CharactersScreen
import com.example.composerickandmorty.ui.view.episodes.EpisodesScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Characters.screenRoute
    ) {
        composable(BottomNavItem.Characters.screenRoute) {
            CharactersScreen()
        }

        composable(BottomNavItem.Episodes.screenRoute) {
            EpisodesScreen()
        }
    }
}

