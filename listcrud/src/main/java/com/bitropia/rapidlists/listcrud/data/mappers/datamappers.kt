package com.bitropia.rapidlists.listcrud.data.mappers
import com.bitropia.rapidlists.listcrud.domain.entities.ListHeader
import com.bitropia.rapidlists.listcrud.data.entities.ListHeader as DomainListHeader


fun ListHeader.toRoomListHeader(): DomainListHeader =
    (
        DomainListHeader(this.Id, this.Description )
    )

fun DomainListHeader.toDomainListHeader(): ListHeader = ListHeader(
    Id,
    Description
)
