package com.example.composerickandmorty.data.repository.episode

import com.example.composerickandmorty.data.model.episode.EpisodeModel
import com.example.composerickandmorty.data.model.episode.EpisodeResponseModel
import com.example.composerickandmorty.data.network.episode.EpisodeService
import com.example.composerickandmorty.domain.model.episode.Episode
import com.example.composerickandmorty.domain.model.episode.EpisodeResponse
import com.example.composerickandmorty.domain.model.episode.toDomain
import javax.inject.Inject

class EpisodeRepository @Inject constructor(
    private val api: EpisodeService
) {
    suspend fun getAllEpisodesFromApi(): EpisodeResponse {
        val episodesFromApi: EpisodeResponseModel = api.getEpisodes()
        //mapping EpisodeModel into Episode (Data layer to Domain layer)
        return episodesFromApi.toDomain()
    }
}