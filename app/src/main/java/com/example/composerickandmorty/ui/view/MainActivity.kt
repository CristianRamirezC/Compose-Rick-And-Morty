package com.example.composerickandmorty.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface

import androidx.compose.ui.Modifier
import com.example.composerickandmorty.ui.view.bottomNavigation.MainNavigationScreenView
import com.example.composerickandmorty.ui.view.theme.ComposeRickAndMortyTheme
import com.example.composerickandmorty.ui.viewModel.character.CharacterViewModel
import com.example.composerickandmorty.ui.viewModel.episode.EpisodeViewModel
import com.example.composerickandmorty.ui.viewModel.location.LocationViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val characterViewModel: CharacterViewModel by viewModels()
    private val episodeViewModel: EpisodeViewModel by viewModels()
    private val locationViewModel: LocationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        characterViewModel.onCreate()
//        episodeViewModel.onCreate()
//        locationViewModel.onCreate()
        setContent {
            ComposeRickAndMortyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainNavigationScreenView(
                        characterViewModel = characterViewModel
                    )
                }
            }
        }
    }
}