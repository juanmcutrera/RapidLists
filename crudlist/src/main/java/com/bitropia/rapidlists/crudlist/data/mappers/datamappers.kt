package com.bitropia.rapidlists.crudlist.data.mappers
import com.bitropia.rapidlists.crudlist.domain.entities.ListHeader
import com.bitropia.rapidlists.crudlist.data.entities.ListHeader as DomainListHeader


fun ListHeader.toRoomListHeader(): DomainListHeader =
    (
        DomainListHeader(this.Id, this.Description )
    )

fun DomainListHeader.toDomainListHeader(): ListHeader = ListHeader(
    Id,
    Description
)
