package com.bitropia.rapidlists.listcrud.usecases
import com.bitropia.rapidlists.listcrud.domain.entities.ListHeader
import com.bitropia.rapidlists.listcrud.data.repositories.ListHeaderRepository
import javax.inject.Inject

class SaveListHeaderUseCase  @Inject constructor(
    private val listheaderRepository: ListHeaderRepository)
{

    suspend operator fun invoke(header: ListHeader) = listheaderRepository.saveListHeader(header)
}


