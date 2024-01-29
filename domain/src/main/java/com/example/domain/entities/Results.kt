package com.example.domain.entities

sealed class Results<out T : Any> {
    data class Success<out T : Any>(val value: T) : Results<T>()
    data class Failure(val error: Throwable) : Results<Nothing>()
}