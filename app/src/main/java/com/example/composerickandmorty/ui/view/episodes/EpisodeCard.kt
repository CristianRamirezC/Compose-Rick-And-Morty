package com.example.composerickandmorty.ui.view.episodes

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composerickandmorty.R
import com.example.composerickandmorty.domain.model.episode.Episode

@Composable
fun EpisodeCard(
    episode: Episode
) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .height(90.dp),
        elevation = 5.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(2f),
                verticalArrangement = Arrangement.SpaceBetween,
            ) {
                EpisodeInformation(episode)
            }
            Text(
                modifier = Modifier
                    .align(Alignment.Bottom)
                    .weight(2f),
                text = episode.episodeAirDate,
                textAlign = TextAlign.Right
            )
        }
    }
}

@Composable
fun EpisodeInformation(episode: Episode) {
    Text(
        text = "${stringResource(R.string.episode)} ${episode.episodeName}",
        style = MaterialTheme.typography.h4.copy(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        ),
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Left,
        maxLines = 2
    )
    Text(
        modifier = Modifier, text = episode.episodeSeason
    )
}