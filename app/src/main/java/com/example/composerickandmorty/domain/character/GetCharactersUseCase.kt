package com.example.composerickandmorty.domain.character

import com.example.composerickandmorty.data.repository.character.CharacterRepository
import com.example.composerickandmorty.domain.model.character.Character
import com.example.composerickandmorty.domain.model.character.CharacterResponse
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(): CharacterResponse {
        return repository.getAllCharactersFromApi()
    }
}