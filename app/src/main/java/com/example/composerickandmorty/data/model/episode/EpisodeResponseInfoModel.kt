package com.example.composerickandmorty.data.model.episode

import com.google.gson.annotations.SerializedName

data class EpisodeResponseInfoModel(
    @SerializedName("count") val numberOfEpisodes: Int = 0,
    @SerializedName("pages") val numberOfPages: Int = 0,
    @SerializedName("next") val nextPage: String = "",
    @SerializedName("prev") val previousPage: String = ""
)
