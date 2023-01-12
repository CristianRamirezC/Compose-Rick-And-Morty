package com.example.composerickandmorty.data.network.episode

import com.example.composerickandmorty.data.model.episode.EpisodeModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class EpisodeService @Inject constructor(
    private val api: EpisodeApiClient
) {
    suspend fun getEpisodes(): List<EpisodeModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllEpisodes()
            response.body() ?: emptyList()
        }
    }
}