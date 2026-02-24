package com.rashid.saleem.navigationincompose.auth

import com.rashid.saleem.navigationincompose.core.BaseRoutes
import kotlinx.serialization.Serializable

sealed class AuthRoutes: BaseRoutes {

    @Serializable object Auth: AuthRoutes()

    @Serializable
    data object Login: AuthRoutes()
    @Serializable
    data object SignUp: AuthRoutes()
    @Serializable
    data object ForgotPassword: AuthRoutes()
}