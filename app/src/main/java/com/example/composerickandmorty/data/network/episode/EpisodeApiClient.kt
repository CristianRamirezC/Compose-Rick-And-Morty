package com.example.composerickandmorty.data.network.episode

import com.example.composerickandmorty.data.model.episode.EpisodeModel
import com.example.composerickandmorty.data.model.episode.EpisodeResponseModel
import com.example.composerickandmorty.data.model.location.LocationModel
import retrofit2.Response
import retrofit2.http.GET

private const val EPISODE_API_URL: String = "episode"

interface EpisodeApiClient {
    @GET(EPISODE_API_URL)
    suspend fun getAllEpisodes(): Response<EpisodeResponseModel>
}