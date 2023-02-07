package com.example.composerickandmorty.ui.view.characterDetails

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.composerickandmorty.ui.viewModel.character.CharacterViewModel
import com.example.composerickandmorty.domain.model.character.Character

@Composable
fun CharacterDetails(
    characterId: Int,
    characterViewModel: CharacterViewModel
) {
    val character = characterViewModel.getCharacterById(characterId)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            model = character.characterImage,
            contentDescription = "character image",
            contentScale = ContentScale.Crop
        )
        CharacterDetailsInformation(character)
    }
}

@Composable
fun CharacterDetailsInformation(character: Character) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            modifier = Modifier,
            text = character.characterName,
            style = MaterialTheme.typography.h4.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                fontFamily = FontFamily.Serif
            ),
        )
        Text(text = character.characterStatus)
        Text(text = character.characterSpecies)
    }
}
