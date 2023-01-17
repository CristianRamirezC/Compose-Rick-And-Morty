package com.example.composerickandmorty.ui.viewModel.episode

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.composerickandmorty.domain.episode.GetEpisodesUseCase
import com.example.composerickandmorty.domain.model.episode.Episode
import com.example.composerickandmorty.domain.model.episode.EpisodeResponseInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EpisodeViewModel @Inject constructor(
    private val getEpisodesUseCase: GetEpisodesUseCase
) : ViewModel() {

    private var _episodesResponseInfo = MutableLiveData<EpisodeResponseInfo>()
    val episodesResponseInfo: LiveData<EpisodeResponseInfo> = _episodesResponseInfo

    private var _episodesList = MutableLiveData<List<Episode>>()
    val episodesList: LiveData<List<Episode>> = _episodesList
}