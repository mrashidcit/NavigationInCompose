package com.rashid.saleem.navigationincompose.auth.login

import androidx.compose.runtime.Composable
import com.rashid.saleem.navigationincompose.core.BaseRoutes
import com.rashid.saleem.navigationincompose.core.CoreRoutes
import com.rashid.saleem.navigationincompose.auth.AuthRoutes
import com.rashid.saleem.navigationincompose.auth.login.components.LoginContent
import com.rashid.saleem.navigationincompose.home.HomeRoutes

@Composable
fun LoginScreen(
    navigateNext: (BaseRoutes) -> Unit
) {

    LoginContent(
        onAction = { action ->
            when (action) {
                LoginAction.ForgotPasswordOnClick -> navigateNext(AuthRoutes.ForgotPassword)
                LoginAction.LogInOnClick -> navigateNext(HomeRoutes.PostListing)
                LoginAction.SignUpOnClick -> navigateNext(AuthRoutes.SignUp)
            }
        }
    )

}