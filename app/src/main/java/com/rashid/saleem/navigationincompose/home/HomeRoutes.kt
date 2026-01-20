package com.rashid.saleem.navigationincompose.home

import com.rashid.saleem.navigationincompose.core.BaseRoute
import kotlinx.serialization.Serializable

sealed class HomeRoutes: BaseRoute {

    @Serializable
    data object PostListing: HomeRoutes()

    @Serializable
    data class PostDetail(
        val postId: String
    ): HomeRoutes()
}