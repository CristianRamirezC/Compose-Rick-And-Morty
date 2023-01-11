package com.example.composerickandmorty.ui.view.bottomNavigation

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreenView() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { MyBottomNavigation(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }
}