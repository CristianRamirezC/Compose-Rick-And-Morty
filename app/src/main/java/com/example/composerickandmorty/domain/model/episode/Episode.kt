package com.example.composerickandmorty.domain.model.episode

import com.example.composerickandmorty.data.model.episode.EpisodeModel
import com.google.gson.annotations.SerializedName

data class Episode(
    val episodeId: Int,
    val episodeName: String,
    val episodeAirDate: String,
    val episodeSeason: String
)


//Mapper from EpisodeModel (Data layer) to Episode (Domain Layer)

fun EpisodeModel.toDomain() = Episode(
    episodeId,
    episodeName,
    episodeAirDate,
    episodeSeason
)