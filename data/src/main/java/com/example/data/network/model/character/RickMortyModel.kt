package com.example.data.network.model.character

import com.google.gson.annotations.SerializedName


data class RickMortyModel(
    @SerializedName("id")
    val id:Int,
    @SerializedName("name")
    val name:String,
    @SerializedName("status")
    val status:String,
    @SerializedName("type")
    val type:String,
    @SerializedName("gender")
    val gender:String,
    @SerializedName("origin")
    val origin: OriginModel,
    @SerializedName("location")
    val location: LocationModel,
    @SerializedName("image")
    val image:String,
    @SerializedName("episode")
    val episode:List<EpisodeModel>,
    @SerializedName("url")
    val url:String,
    @SerializedName("url")
    val created:String
)