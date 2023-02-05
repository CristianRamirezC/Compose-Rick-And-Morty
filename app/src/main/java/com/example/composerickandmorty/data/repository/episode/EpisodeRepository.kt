package com.example.composerickandmorty.data.repository.episode

import com.example.composerickandmorty.data.model.episode.EpisodeResponseModel
import com.example.composerickandmorty.data.network.episode.EpisodeService
import com.example.composerickandmorty.domain.model.episode.EpisodeResponse
import com.example.composerickandmorty.domain.model.episode.toDomain
import javax.inject.Inject

class EpisodeRepository @Inject constructor(
    private val apiService: EpisodeService
) {
    suspend fun getAllEpisodesFromApi(): EpisodeResponse {
        val episodesFromApi: EpisodeResponseModel = apiService.getEpisodes()
        //mapping EpisodeModel into Episode (Data layer to Domain layer)
        return episodesFromApi.toDomain()
    }
}