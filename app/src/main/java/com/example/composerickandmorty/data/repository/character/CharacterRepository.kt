package com.example.composerickandmorty.data.repository.character

import com.example.composerickandmorty.data.network.character.CharacterService
import javax.inject.Inject
import com.example.composerickandmorty.domain.model.character.CharacterResponse
import com.example.composerickandmorty.domain.model.character.toDomain
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable

class CharacterRepository @Inject constructor(
    private val api: CharacterService
) {
    fun getAllCharactersFromApi(): Single<CharacterResponse> {
        return api.getCharacters().map { it.toDomain() }
    }
}