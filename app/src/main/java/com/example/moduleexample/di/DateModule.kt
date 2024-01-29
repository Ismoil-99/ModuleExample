package com.example.moduleexample.di

import com.example.data.network.repositories.EpisodeRepositoryImpl
import com.example.domain.repository.EpisodeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class DateModule {

    @Binds
    abstract fun bindRepository(episodeRepositoryImpl: EpisodeRepositoryImpl):EpisodeRepository
}