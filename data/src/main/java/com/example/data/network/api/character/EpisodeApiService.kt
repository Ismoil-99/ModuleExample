package com.example.data.network.api.character

import com.example.data.network.model.character.RickMortyModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EpisodeApiService{

    @GET("character/{id}")
    suspend fun getCharacterById(
        @Path("id") id:String
    ):Response<RickMortyModel>

}