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

@Composable
fun CharactersScreen(
    characterViewModel: CharacterViewModel
) {
    val characterList: List<Character> by characterViewModel
        .charactersList.observeAsState(initial = emptyList())

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
    ) {
        items(items = characterList) { character ->
            CharacterCard(character)
        }
    }
}