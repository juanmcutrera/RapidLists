package com.bitropia.rapidlists.listcrud.di


import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

import com.bitropia.rapidlists.listcrud.data.db.RoomDataSource
import com.bitropia.rapidlists.listcrud.data.db.AppDatabase
import com.bitropia.rapidlists.listcrud.data.source.LocalDataSource


@Module
@InstallIn(SingletonComponent::class)

class AppModule {


    @Provides
    @Singleton
    fun databaseProvider(app: Application) = Room.databaseBuilder(
        app,
        AppDatabase::class.java,
        "InclusiveListsBlueprint"
    ).build()


    @Provides
    fun localDataSourceProvider(db: AppDatabase): LocalDataSource = RoomDataSource(db)

}