package com.example.composerickandmorty.ui.viewModel.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.composerickandmorty.domain.character.GetCharactersUseCase
import com.example.composerickandmorty.domain.model.character.CharacterResponseInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.example.composerickandmorty.domain.model.character.Character

@HiltViewModel
class CharacterViewModel
@Inject constructor(
    private val getCharactersUseCase: GetCharactersUseCase
) : ViewModel() {

    private var _charactersResponseInfo = MutableLiveData<CharacterResponseInfo>()
    val charactersResponseInfo: LiveData<CharacterResponseInfo> = _charactersResponseInfo

    private var _charactersList = MutableLiveData<List<Character>>()
    val charactersList: LiveData<List<Character>> = _charactersList
}