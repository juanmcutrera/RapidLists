package com.bitropia.rapidlists.listcrud.di

import com.bitropia.rapidlists.listcrud.data.repositories.ListHeaderRepository
import com.bitropia.rapidlists.listcrud.data.source.LocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataModule {


    @Provides
    fun listheaderRepositoryProvider(
        localDataSource: LocalDataSource,

    ) = ListHeaderRepository(localDataSource)
}