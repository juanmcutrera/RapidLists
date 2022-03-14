package com.bitropia.rapidlists.crudlist.data.repositories
import com.bitropia.rapidlists.crudlist.domain.entities.ListHeader
import com.bitropia.rapidlists.crudlist.data.source.LocalDataSource


class ListHeaderRepository(private val localDataSource: LocalDataSource)
{
    suspend fun saveListHeader(header: ListHeader) = localDataSource.saveListHeader(header)

}