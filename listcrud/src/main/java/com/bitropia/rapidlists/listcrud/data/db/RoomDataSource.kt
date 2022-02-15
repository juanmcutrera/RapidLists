package com.bitropia.rapidlists.listcrud.data.db

import com.bitropia.rapidlists.listcrud.data.mappers.toRoomListHeader
import com.bitropia.rapidlists.listcrud.domain.entities.ListHeader
import com.bitropia.rapidlists.listcrud.data.source.LocalDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class RoomDataSource(db: AppDatabase) : LocalDataSource {
    private val listDao = db.listDao()

    override suspend fun saveListHeader(listheader: ListHeader): Long =
        withContext(Dispatchers.IO) { listDao.saveListHeader(listheader.toRoomListHeader()) }
    }
