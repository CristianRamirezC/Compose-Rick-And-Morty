package com.example.composerickandmorty.domain.model.episode

import com.example.composerickandmorty.data.model.episode.EpisodeResponseInfoModel
import com.google.gson.annotations.SerializedName

data class EpisodeResponseInfo(
    val numberOfEpisodes: Int,
    val numberOfPages: Int,
    val nextPage: String?,
    val previousPage: String?
)

fun EpisodeResponseInfoModel.toDomain() = EpisodeResponseInfo(
    numberOfEpisodes,
    numberOfPages,
    nextPage,
    previousPage
)
