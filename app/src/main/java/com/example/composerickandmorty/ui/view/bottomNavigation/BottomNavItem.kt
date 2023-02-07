package com.example.composerickandmorty.ui.view.bottomNavigation

import com.example.composerickandmorty.R

sealed class BottomNavItem(
    var title: String,
    var icon: Int,
    var screenRoute: String
) {

    object Characters : BottomNavItem(
        title = "Characters",
        icon = R.drawable.ic_characters,
        screenRoute = "characters"
    )

    object Episodes : BottomNavItem(
        title = "Episodes",
        icon = R.drawable.ic_episodes,
        screenRoute = "episodes"
    )

    object Locations : BottomNavItem(
        title = "Locations",
        icon = R.drawable.ic_locations,
        screenRoute = "locations"
    )
}
