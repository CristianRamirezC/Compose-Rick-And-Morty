package com.example.composerickandmorty.ui.view.bottomNavigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class ScreenNavItem(
    var baseRoute: String,
    var navArgs: List<NavArgs> = emptyList()
) {

    val route = run {
        val argKeys = navArgs.map { "{${it.key}}" }
        listOf(baseRoute)
            .plus(argKeys)
            .joinToString(separator = "/")
    }

    val args = navArgs.map {
        navArgument(it.key) {type = it.navType}
    }

    object CharacterDetails : ScreenNavItem(
        baseRoute = "characterDetail",
        navArgs = listOf(NavArgs.CharacterId)
    )

}

enum class NavArgs(
    val key: String,
    val navType: NavType<*>
) {
    CharacterId("characterId", NavType.IntType)
}