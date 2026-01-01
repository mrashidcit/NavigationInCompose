package com.rashid.saleem.navigationincompose.auth.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rashid.saleem.navigationincompose.Routes
import com.rashid.saleem.navigationincompose.auth.login.components.LoginContent

@Composable
fun LoginScreen(
    navigateNext: (Routes) -> Unit
) {

    LoginContent(
        onAction = { action ->
            when (action) {
                LoginAction.ForgotPasswordOnClick -> navigateNext(Routes.ForgotPassword)
                LoginAction.LogInOnClick -> navigateNext(Routes.Home)
                LoginAction.SignUpOnClick -> TODO()
            }
        }
    )

}