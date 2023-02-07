package com.example.composerickandmorty.data.network.character

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.composerickandmorty.data.model.character.CharacterResponseModel
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import okhttp3.internal.wait
import javax.inject.Inject

class CharacterService @Inject constructor(
    private val api: CharacterApiClient
) {
    private val _charactersResponse = MutableLiveData<CharacterResponseModel>()
    fun getCharacters(): Single<CharacterResponseModel> {
        return api.getAllCharacters()
    }
}