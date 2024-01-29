package com.example.domain.repository

import com.example.domain.entities.Character
import com.example.domain.entities.Results


interface EpisodeRepository {

     suspend fun getCharacterById(id:String): Results<Character>
}