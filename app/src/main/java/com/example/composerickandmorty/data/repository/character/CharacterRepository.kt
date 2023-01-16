package com.example.composerickandmorty.data.repository.character

import com.example.composerickandmorty.data.model.character.CharacterModel
import com.example.composerickandmorty.data.network.character.CharacterService
import javax.inject.Inject
import com.example.composerickandmorty.domain.model.character.Character
import com.example.composerickandmorty.domain.model.character.toDomain

class CharacterRepository @Inject constructor(
    private val api: CharacterService
) {
    suspend fun getAllCharactersFromApi(): List<Character> {
        val charactersFromApi: List<CharacterModel> = api.getCharacters()
        //mapping CharacterModel into Character (Data layer to Domain layer)
        return charactersFromApi.map { it.toDomain() }
    }
}