package com.example.composerickandmorty.data.model.episode

import com.google.gson.annotations.SerializedName

data class EpisodeResponseInfoModel(
    @SerializedName("count") var numberOfEpisodes: Int = 0,
    @SerializedName("pages") var numberOfPages: Int = 0,
    @SerializedName("next") var nextPage: String = "",
    @SerializedName("prev") var previousPage: String = ""
)
