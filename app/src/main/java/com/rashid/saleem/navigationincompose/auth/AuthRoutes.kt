package com.rashid.saleem.navigationincompose.auth

import com.rashid.saleem.navigationincompose.core.BaseRoute
import kotlinx.serialization.Serializable

sealed class AuthRoutes: BaseRoute {

    @Serializable
    data object Login: AuthRoutes()

    @Serializable
    data object ForgotPassword: AuthRoutes()

    @Serializable
    data object SignUp: AuthRoutes()
}