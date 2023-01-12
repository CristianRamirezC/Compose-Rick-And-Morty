package com.example.composerickandmorty.data.model.episode

import com.google.gson.annotations.SerializedName

data class EpisodeModel(
    @SerializedName("id") var episodeId: Int = 0,
    @SerializedName("name") var episodeName: String = "",
    @SerializedName("air_date") var episodeAirDate: String = "",
    @SerializedName("episode") var episodeSeason: String = ""
)
