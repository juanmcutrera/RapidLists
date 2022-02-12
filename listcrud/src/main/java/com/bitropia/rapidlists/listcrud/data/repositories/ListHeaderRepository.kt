package com.bitropia.rapidlists.listcrud.data.repositories
import com.bitropia.rapidlists.listcrud.domain.entities.ListHeader
import com.bitropia.rapidlists.listcrud.data.source.LocalDataSource


class ListHeaderRepository(private val localDataSource: LocalDataSource)
{

    suspend fun saveListHeader(header: ListHeader) = localDataSource.saveListHeader(header)


}