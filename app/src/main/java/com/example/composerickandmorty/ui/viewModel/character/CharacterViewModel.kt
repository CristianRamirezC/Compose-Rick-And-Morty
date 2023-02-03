package com.example.composerickandmorty.ui.viewModel.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composerickandmorty.domain.character.GetCharactersUseCase
import com.example.composerickandmorty.domain.model.character.CharacterResponseInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.example.composerickandmorty.domain.model.character.Character
import kotlinx.coroutines.launch

@HiltViewModel
class CharacterViewModel
@Inject constructor(
    private val getCharactersUseCase: GetCharactersUseCase
) : ViewModel() {

    private var _charactersResponseInfo = MutableLiveData<CharacterResponseInfo>()
    val charactersResponseInfo: LiveData<CharacterResponseInfo> = _charactersResponseInfo

    private var _charactersList = MutableLiveData<List<Character>>()
    val charactersList: LiveData<List<Character>> = _charactersList

    private var _isCharacterLoading = MutableLiveData<Boolean>()
    val isCharacterLoading: LiveData<Boolean> = _isCharacterLoading

    fun getCharacters() {
        viewModelScope.launch {

            _isCharacterLoading.postValue(true)

            val characters = getCharactersUseCase()
            _charactersList.postValue(characters.responseResultsList)
            _charactersResponseInfo.postValue(characters.responseInfo)

            _isCharacterLoading.postValue(false)
        }
    }
}