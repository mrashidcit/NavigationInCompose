package com.rashid.saleem.navigationincompose

import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    data object ScreenA: Routes()

    @Serializable
    data class ScreenB(
        val userId: Int
    ): Routes()

    @Serializable
    data object PostListing: Routes()

    @Serializable
    data object PostDetail: Routes()



}