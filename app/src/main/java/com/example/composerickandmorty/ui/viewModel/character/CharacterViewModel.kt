package com.example.composerickandmorty.ui.viewModel.character

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composerickandmorty.data.model.character.CharacterResponseModel
import com.example.composerickandmorty.domain.character.GetCharactersUseCase
import com.example.composerickandmorty.domain.model.character.CharacterResponseInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.example.composerickandmorty.domain.model.character.Character
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.delay
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

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    private var _isErrorGettingCharacters = MutableLiveData<Boolean>()
    val isErrorGettingCharacters: LiveData<Boolean> = _isErrorGettingCharacters

    fun onCreate() {

        _isCharacterLoading.postValue(true)

        compositeDisposable.add(
            getCharactersUseCase.getCharacters()
                .subscribeOn(Schedulers.io())
                .subscribe(
                    {
                        _charactersResponseInfo.postValue(it.responseInfo)
                        _charactersList.postValue(it.responseResultsList)
                        _isCharacterLoading.postValue(false)
                    },
                    {
                        _isErrorGettingCharacters.postValue(true)
                    }
                )
        )
    }

    fun getCharacterById(characterId: Int): Character {
        return _charactersList.value?.find {
            it.characterID == characterId
        }!!
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}