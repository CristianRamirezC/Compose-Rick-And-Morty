package com.example.composerickandmorty.ui.view.characters

import android.graphics.Paint.Style
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.composerickandmorty.R
import com.example.composerickandmorty.domain.model.character.Character

@Composable
fun CharacterCard(
    character: Character,
    onCardClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .padding(10.dp)
            .clickable { onCardClick() },
        elevation = 8.dp,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            AsyncImage(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(120.dp),
                model = character.characterImage,
                contentDescription = stringResource(R.string.characterImage),
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )
            CharacterCardInformation(character)
        }

    }
}

@Composable
fun CharacterCardInformation(
    character: Character

) {
    Column(
        modifier = Modifier
            .padding(
                start = 20.dp,
                end = 30.dp,
                bottom = 20.dp,
                top = 10.dp
            )
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        MainCharacterCardInformation(character)
        Divider(
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
        )
        CharacterStatus(character)
    }
}

@Composable
fun CharacterStatus(
    character: Character
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(R.string.characterStatus)
        )
        Text(
            text = character.characterStatus,
            fontStyle = FontStyle.Italic
        )
    }
}

@Composable
fun MainCharacterCardInformation(
    character: Character
) {
    Column() {
        Text(
            modifier = Modifier,
            text = character.characterName,
            style = MaterialTheme.typography.h4.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            ),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            modifier = Modifier,
            text = character.characterGender,
            style = MaterialTheme.typography.h5.copy(
                fontSize = 15.sp,
                fontWeight = FontWeight.Light
            )
        )
        Text(
            modifier = Modifier,
            text = character.characterSpecies,
            style = MaterialTheme.typography.h5.copy(
                fontSize = 15.sp,
                fontWeight = FontWeight.Light
            )

        )
    }
}
