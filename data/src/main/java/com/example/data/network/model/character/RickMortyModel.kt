package com.example.data.network.model.character

import com.google.gson.annotations.SerializedName


data class  RickMortyModel(
    @SerializedName("id")
    val id:Int,
    @SerializedName("name")
    val name:String,
    @SerializedName("status")
    val status:String,
    @SerializedName("species")
    val species:String,
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
    @SerializedName("url")
    val url:String,
    @SerializedName("created")
    val created:String
)