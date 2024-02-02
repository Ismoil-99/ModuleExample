package com.example.presentation

import androidx.lifecycle.ViewModel
import com.example.domain.usecase.EpisodeUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class EpisodeViewModel  @Inject constructor(private val episodeUsecase: EpisodeUsecase) :ViewModel() {


    suspend fun getCharacterById(id:String) = episodeUsecase.invoke(id)
}