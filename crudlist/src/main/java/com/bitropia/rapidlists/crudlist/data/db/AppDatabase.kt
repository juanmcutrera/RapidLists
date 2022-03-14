package com.bitropia.rapidlists.crudlist.data.db
import androidx.room.Database
import androidx.room.RoomDatabase
import com.bitropia.rapidlists.crudlist.data.entities.ListHeader


@Database(entities = [ListHeader::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun listDao(): ListDao


}