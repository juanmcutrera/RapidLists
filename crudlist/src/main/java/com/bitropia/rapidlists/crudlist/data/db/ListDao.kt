package com.bitropia.rapidlists.crudlist.data.db


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.bitropia.rapidlists.crudlist.data.entities.ListHeader


@Dao
public interface ListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveListHeader(listheader: ListHeader): Long

}