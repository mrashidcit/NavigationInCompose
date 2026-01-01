package com.rashid.saleem.navigationincompose.auth.login

sealed interface LoginAction {

    data object ForgotPasswordOnClick: LoginAction
    data object LogInOnClick: LoginAction
    data object SignUpOnClick: LoginAction

}