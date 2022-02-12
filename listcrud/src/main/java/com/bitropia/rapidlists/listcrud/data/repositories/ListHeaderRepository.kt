package com.bitropia.rapidlists.listcrud.data.repositories
import com.bitropia.rapidlists.listcrud.data.source.LocalDataSource
import com.bitropia.rapidlists.listcrud.domain.entities.ListHeader


class ListHeaderRepository(private val localDataSource: LocalDataSource)
{

    suspend fun saveListHeader(header: ListHeader) = localDataSource.saveListHeader(header)


}