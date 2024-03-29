package com.example.composerickandmorty.data.network.episode

import com.example.composerickandmorty.data.model.episode.EpisodeResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class EpisodeService @Inject constructor(
    private val apiClient: EpisodeApiClient
) {
    suspend fun getEpisodes(): EpisodeResponseModel {
        return withContext(Dispatchers.IO) {
            apiClient.getAllEpisodes().body() ?: EpisodeResponseModel()
        }
    }
}