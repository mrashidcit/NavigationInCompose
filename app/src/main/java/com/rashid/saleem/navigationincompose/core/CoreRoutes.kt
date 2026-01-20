package com.rashid.saleem.navigationincompose.core

import kotlinx.serialization.Serializable


interface BaseRoute


@Serializable
sealed class CoreRoutes: BaseRoute {

    @Serializable
    data object Splash: CoreRoutes()

    @Serializable
    data object ScreenA: CoreRoutes()

    @Serializable
    data class ScreenB(
        val userId: Int
    ): CoreRoutes()
}