package com.example.composerickandmorty.data.repository.episode

import com.example.composerickandmorty.data.model.episode.EpisodeModel
import com.example.composerickandmorty.data.network.episode.EpisodeService
import com.example.composerickandmorty.domain.model.episode.Episode
import com.example.composerickandmorty.domain.model.episode.toDomain
import javax.inject.Inject

class EpisodeRepository @Inject constructor(
    private val api: EpisodeService
) {
    suspend fun getAllEpisodesFromApi(): List<Episode> {
        val episodesFromApi: List<EpisodeModel> = api.getEpisodes()
        //mapping EpisodeModel into Episode (Data layer to Domain layer)
        return episodesFromApi.map { it.toDomain() }
    }
}