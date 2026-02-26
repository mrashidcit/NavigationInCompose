package com.rashid.saleem.navigationincompose.data.repository

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

interface SharedRepository {

    val postUpdates: SharedFlow<Unit>

    suspend fun notifyPostUpdated()

    companion object {
        val instance: SharedRepository by lazy { SharedRepositoryImpl() }
    }


}


class SharedRepositoryImpl: SharedRepository {

    private val _postUpdates = MutableSharedFlow<Unit>()

    override val postUpdates: SharedFlow<Unit>
        get() = _postUpdates

    override suspend fun notifyPostUpdated() {
        _postUpdates.emit(Unit)
    }

}