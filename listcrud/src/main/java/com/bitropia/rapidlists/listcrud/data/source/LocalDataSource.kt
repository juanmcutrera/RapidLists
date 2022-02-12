package com.bitropia.rapidlists.listcrud.data.source
import com.bitropia.rapidlists.listcrud.domain.entities.ListHeader

interface LocalDataSource {

    suspend fun saveListHeader(header: ListHeader): Long

}