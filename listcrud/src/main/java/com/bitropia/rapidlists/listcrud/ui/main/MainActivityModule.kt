package com.bitropia.rapidlists.listcrud.ui.main
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

import com.bitropia.rapidlists.listcrud.data.repositories.ListHeaderRepository
import com.bitropia.rapidlists.listcrud.domain.usecases.SaveListHeaderUseCase

@Module
@InstallIn(ViewModelComponent::class)
class MainActivityModule {

    @Provides
    @ViewModelScoped
    fun getListHeaderProvider(listheaderRepository: ListHeaderRepository) =
        SaveListHeaderUseCase(listheaderRepository)

}