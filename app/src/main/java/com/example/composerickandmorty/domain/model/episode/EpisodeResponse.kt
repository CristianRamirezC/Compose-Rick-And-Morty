package com.example.composerickandmorty.domain.model.episode

import com.example.composerickandmorty.data.model.episode.EpisodeModel
import com.example.composerickandmorty.data.model.episode.EpisodeResponseInfoModel
import com.example.composerickandmorty.data.model.episode.EpisodeResponseModel
import com.google.gson.annotations.SerializedName

data class EpisodeResponse(
    val episodeInfoModel: EpisodeResponseInfo,
    val episodeResultsList: List<Episode>
)

fun EpisodeResponseModel.toDomain() = EpisodeResponse(
    episodeInfoModel.toDomain(),
    episodeResultsList.map {
        it.toDomain()
    }
)