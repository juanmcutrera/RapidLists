package com.bitropia.rapidlists.crudlist.usecases
import com.bitropia.rapidlists.crudlist.domain.entities.ListHeader
import com.bitropia.rapidlists.crudlist.data.repositories.ListHeaderRepository
import javax.inject.Inject

class SaveListHeaderUseCase  @Inject constructor(
    private val listheaderRepository: ListHeaderRepository)
{

    suspend operator fun invoke(header: ListHeader) = listheaderRepository.saveListHeader(header)
}


