package com.rashid.saleem.navigationincompose.core

import kotlinx.serialization.Serializable

interface BaseRoutes

@Serializable
sealed class CoreRoutes: BaseRoutes {

    // Total Screens : 18

    @Serializable
    data object Splash: CoreRoutes()
    @Serializable
    data object ScreenA: CoreRoutes()
    @Serializable
    data class ScreenB(
        val userId: Int
    ): CoreRoutes()

}