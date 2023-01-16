package com.example.composerickandmorty.domain.episode

import com.example.composerickandmorty.data.repository.episode.EpisodeRepository
import com.example.composerickandmorty.domain.model.episode.Episode
import javax.inject.Inject

class GetEpisodesUseCase @Inject constructor(
    private val repository: EpisodeRepository
) {
    suspend operator fun invoke(): List<Episode> {
        return repository.getAllEpisodesFromApi()
    }
}