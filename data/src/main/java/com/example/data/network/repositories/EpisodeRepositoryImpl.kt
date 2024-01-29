package com.example.data.network.repositories

import com.example.data.network.api.character.EpisodeApiService
import com.example.data.network.mappers.DataMapper
import com.example.domain.entities.Character
import com.example.domain.entities.Results
import com.example.domain.repository.EpisodeRepository
import java.lang.Exception
import javax.inject.Inject


class EpisodeRepositoryImpl @Inject constructor(
    private val episodeApiService: EpisodeApiService,
    private val mapper: DataMapper
) :EpisodeRepository {
    override suspend fun getCharacterById(id: String): Results<Character> {
        return try {
            val coinsList = episodeApiService.getCharacterById(
                id = id
            ).body()
            val mapperCharacter = mapper.convertCharacter(coinsList!!)
            Results.Success(mapperCharacter)
        }catch (e:Exception){
            Results.Failure(e)
        }
    }
}