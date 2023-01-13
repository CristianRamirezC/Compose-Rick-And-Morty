package com.example.composerickandmorty.domain.model.episode

import com.example.composerickandmorty.data.model.episode.EpisodeModel
import com.google.gson.annotations.SerializedName

data class Episode(
    var episodeId: Int,
    var episodeName: String,
    var episodeAirDate: String,
    var episodeSeason: String
)


//Mapper from EpisodeModel (Data layer) to Episode (Domain Layer)

fun EpisodeModel.toDomain() = Episode(
    episodeId,
    episodeName,
    episodeAirDate,
    episodeSeason
)