package com.example.composerickandmorty.data.network.episode

import com.example.composerickandmorty.data.model.episode.EpisodeModel
import com.example.composerickandmorty.data.model.location.LocationModel
import retrofit2.Response
import retrofit2.http.GET

interface EpisodeApiClient {
    @GET("episode")
    suspend fun getAllEpisodes(): Response<List<EpisodeModel>>
}