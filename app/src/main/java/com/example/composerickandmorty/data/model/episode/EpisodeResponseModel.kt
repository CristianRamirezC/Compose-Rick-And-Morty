package com.example.composerickandmorty.data.model.episode

import com.google.gson.annotations.SerializedName

data class EpisodeResponseModel(
    @SerializedName("info") var episodeInfoModel: EpisodeResponseInfoModel,
    @SerializedName("results") var episodeResultsList: List<EpisodeModel>
)
