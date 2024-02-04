package com.example.domain.usecase

import com.example.domain.repository.EpisodeRepository
import javax.inject.Inject


class EpisodeUsecase @Inject constructor (private val episodeRepository: EpisodeRepository ) {
    suspend operator fun invoke(id: String) = episodeRepository.getCharacterById(id)
}