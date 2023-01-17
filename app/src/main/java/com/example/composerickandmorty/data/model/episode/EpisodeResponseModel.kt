package com.example.composerickandmorty.data.model.episode

import com.google.gson.annotations.SerializedName

data class EpisodeResponseModel(
    @SerializedName("info")
    val episodeInfoModel: EpisodeResponseInfoModel = EpisodeResponseInfoModel(),
    @SerializedName("results")
    val episodeResultsList: List<EpisodeModel> = emptyList()
)
