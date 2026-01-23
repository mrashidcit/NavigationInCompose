package com.rashid.saleem.navigationincompose.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.rashid.saleem.navigationincompose.auth.forgotPassword.ForgotPasswordScreen
import com.rashid.saleem.navigationincompose.auth.login.LoginScreen
import com.rashid.saleem.navigationincompose.auth.signUp.SignUpScreen
import com.rashid.saleem.navigationincompose.home.HomeRoutes

fun NavGraphBuilder.authScreens(navController: NavHostController) {
    composable<AuthRoutes.Login> {
        LoginScreen { route ->
            navController.navigate(route) {
                if (route is HomeRoutes.PostListing) {
                    popUpTo(AuthRoutes.Login) {
                        inclusive = true
                    }
                }
            }
        }
    }
    composable<AuthRoutes.SignUp> {
        SignUpScreen {
            navController.navigateUp()
        }
    }
    composable<AuthRoutes.ForgotPassword> {
        ForgotPasswordScreen {
            navController.navigateUp()
        }
    }
}