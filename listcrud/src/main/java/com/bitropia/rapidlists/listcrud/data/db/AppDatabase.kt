package com.bitropia.rapidlists.listcrud.data.db
import androidx.room.Database
import androidx.room.RoomDatabase



@Database(entities = [ListHeader::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun listDao(): ListDao

    /*companion object {

        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "InclusiveListsBlueprintDb"
                    ).fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }*/



}