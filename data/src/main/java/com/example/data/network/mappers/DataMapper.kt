package com.example.data.network.mappers

import com.example.data.network.model.character.RickMortyModel
import com.example.domain.entities.Character
import javax.inject.Inject

class DataMapper @Inject constructor() {
    fun convertCharacter(rickMortyModel: RickMortyModel): Character {
        return Character(
            name = rickMortyModel.name,
            status = rickMortyModel.status,
            gender = rickMortyModel.gender
        )
    }
}