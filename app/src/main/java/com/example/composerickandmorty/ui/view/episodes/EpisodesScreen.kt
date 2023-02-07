package com.example.composerickandmorty.ui.view.episodes

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.composerickandmorty.domain.model.episode.Episode
import com.example.composerickandmorty.ui.view.util.LoadingScreen
import com.example.composerickandmorty.ui.viewModel.episode.EpisodeViewModel

@Composable
fun EpisodesScreen(
    episodeViewModel: EpisodeViewModel
) {
    val episodesList: List<Episode> by
    episodeViewModel.episodesList.observeAsState(initial = emptyList())

    val isEpisodeLoading: Boolean by
    episodeViewModel.isEpisodeLoading.observeAsState(initial = true)

    if (isEpisodeLoading) {
        LoadingScreen()
    } else {
        LazyColumn(
            modifier = Modifier.fillMaxHeight(),
        ) {
            items(items = episodesList) { episode ->
                EpisodeCard(episode)
            }
        }
    }
}
