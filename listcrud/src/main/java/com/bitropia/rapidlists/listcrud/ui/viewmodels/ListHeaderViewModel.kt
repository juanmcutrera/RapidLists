package com.bitropia.rapidlists.listcrud.ui.viewmodels
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.*
import com.bitropia.rapidlists.listcrud.domain.entities.ListHeader
import com.bitropia.rapidlists.listcrud.usecases.SaveListHeaderUseCase
import com.bitropia.rapidlists.listcrud.ui.common.ScopedViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ListHeaderViewModel @Inject constructor(private val saveListHeader: SaveListHeaderUseCase) : ScopedViewModel()
{
    private val coroutineScope = CoroutineScope(Dispatchers.Main)


    init {

        initScope()


    }

    fun saveListHeader(header: ListHeader) {

        coroutineScope.launch(Dispatchers.IO) {
            saveListHeader.invoke(header)

        }
    }


}