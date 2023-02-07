package com.example.composerickandmorty.ui.viewModel.episode

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composerickandmorty.domain.episode.GetEpisodesUseCase
import com.example.composerickandmorty.domain.model.episode.Episode
import com.example.composerickandmorty.domain.model.episode.EpisodeResponseInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EpisodeViewModel @Inject constructor(
    private val getEpisodesUseCase: GetEpisodesUseCase
) : ViewModel() {

    private var _episodesResponseInfo = MutableLiveData<EpisodeResponseInfo>()
    val episodesResponseInfo: LiveData<EpisodeResponseInfo> = _episodesResponseInfo

    private var _episodesList = MutableLiveData<List<Episode>>()
    val episodesList: LiveData<List<Episode>> = _episodesList

    private var _isEpisodeLoading = MutableLiveData<Boolean>()
    val isEpisodeLoading: LiveData<Boolean> = _isEpisodeLoading


    fun onCreate() {
        viewModelScope.launch {
            _isEpisodeLoading.postValue(true)

            val episodes = getEpisodesUseCase()
            _episodesList.postValue(episodes.episodeResultsList)
            _episodesResponseInfo.postValue(episodes.episodeInfo)

            _isEpisodeLoading.postValue(false)
        }
    }
}