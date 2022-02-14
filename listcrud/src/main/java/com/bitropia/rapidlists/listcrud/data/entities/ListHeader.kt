package com.bitropia.rapidlists.listcrud.data.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "listheader")
class ListHeader
{
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    var Id: Int = 0

    @ColumnInfo(name = "description")
    var Description: String = ""

    constructor() {}

    constructor(id: Int,  description: String )
    {
        this.Id = id
        this.Description = description

    }
}

