package com.example.composerickandmorty.ui.view.characterDetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composerickandmorty.ui.viewModel.character.CharacterViewModel
import com.example.composerickandmorty.ui.viewModel.location.LocationViewModel

@Composable
fun CharacterDetails(
    characterId: Int,
    characterViewModel: CharacterViewModel
) {
    val character = characterViewModel.getCharacterById(characterId)

    Text(text = character.characterName)
}