package com.example.composerickandmorty.domain.character

import com.example.composerickandmorty.data.repository.character.CharacterRepository
import com.example.composerickandmorty.domain.model.character.CharacterResponse
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    fun getCharacters(): Single<CharacterResponse> {
        return repository.getAllCharactersFromApi()
    }
}