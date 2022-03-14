package com.bitropia.rapidlists.crudlist.data.source
import com.bitropia.rapidlists.crudlist.domain.entities.ListHeader

interface LocalDataSource {

    suspend fun saveListHeader(listheader: ListHeader): Long

}