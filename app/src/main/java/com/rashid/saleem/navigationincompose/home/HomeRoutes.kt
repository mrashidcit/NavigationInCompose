package com.rashid.saleem.navigationincompose.home

import com.rashid.saleem.navigationincompose.core.BaseRoutes
import kotlinx.serialization.Serializable

sealed class HomeRoutes: BaseRoutes {


    @Serializable
    data object Home: HomeRoutes()

    @Serializable
    data object PostListing: HomeRoutes()
    @Serializable
    data class PostDetail(
        val postId: String
    ): HomeRoutes()
}