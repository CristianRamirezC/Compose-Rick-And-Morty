package com.example.composerickandmorty.ui.view.characters

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.example.composerickandmorty.ui.viewModel.character.CharacterViewModel
import com.example.composerickandmorty.domain.model.character.Character
import com.example.composerickandmorty.ui.view.util.ErrorScreen
import com.example.composerickandmorty.ui.view.util.LoadingScreen

@Composable
fun CharactersScreen(
    characterViewModel: CharacterViewModel,
    onCharacterClick: (Character) -> Unit
) {
    val characterList: List<Character> by characterViewModel
        .charactersList.observeAsState(initial = emptyList())

    val isLoading: Boolean by characterViewModel.isCharacterLoading
        .observeAsState(initial = true)

    val isErrorGettingCharacters: Boolean by characterViewModel.isErrorGettingCharacters
        .observeAsState(initial = false)

    if (isErrorGettingCharacters) {
        ErrorScreen()
    } else {
        CharacterMainScreen(
            characterList = characterList,
            isLoading = isLoading,
            onCharacterClick = onCharacterClick
        )
    }
}

@Composable
fun CharacterMainScreen(
    characterList: List<Character>,
    isLoading: Boolean,
    onCharacterClick: (Character) -> Unit
) {
    if (isLoading) {
        LoadingScreen()
    } else {
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            items(items = characterList) { character ->
                CharacterCard(
                    character = character,
                    onCardClick = { onCharacterClick(character) }
                )
            }
        }
    }
}
