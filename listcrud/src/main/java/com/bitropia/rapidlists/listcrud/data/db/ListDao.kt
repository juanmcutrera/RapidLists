package com.bitropia.rapidlists.listcrud.data.db


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy


@Dao
public interface ListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveListHeader(listheader: ListHeader): Long

}