package com.bitropia.rapidlists.crudlist.data.db

import com.bitropia.rapidlists.crudlist.data.mappers.toRoomListHeader
import com.bitropia.rapidlists.crudlist.domain.entities.ListHeader
import com.bitropia.rapidlists.crudlist.data.source.LocalDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class RoomDataSource(db: AppDatabase) : LocalDataSource {
    private val listDao = db.listDao()

    override suspend fun saveListHeader(listheader: ListHeader): Long =
        withContext(Dispatchers.IO) { listDao.saveListHeader(listheader.toRoomListHeader()) }
    }
