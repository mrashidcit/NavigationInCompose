package com.rashid.saleem.navigationincompose.auth

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.rashid.saleem.navigationincompose.auth.forgotPassword.ForgotPasswordScreen
import com.rashid.saleem.navigationincompose.auth.login.LoginScreen
import com.rashid.saleem.navigationincompose.auth.signUp.SignUpScreen
import com.rashid.saleem.navigationincompose.core.extensions.sharedViewModel
import com.rashid.saleem.navigationincompose.home.HomeRoutes



fun NavGraphBuilder.authScreens(navController: NavHostController) {

    navigation<AuthRoutes.Auth>(
        startDestination = AuthRoutes.Login
    ) {

        composable<AuthRoutes.Login> { backstackEntry ->

            val viewModel: AuthViewModel = navController
                .sharedViewModel(backstackEntry, AuthRoutes.Auth)

            LoginScreen(
                viewModel = viewModel,
            ) { route ->
                navController.navigate(route) {
                    if (route is HomeRoutes.PostListing) {
                        popUpTo(AuthRoutes.Login) {
                            inclusive = true
                        }
                    }
                }
            }
        }
        composable<AuthRoutes.SignUp> {backstackEntry ->

            val viewModel: AuthViewModel = navController
                .sharedViewModel(backstackEntry, AuthRoutes.Auth)

            SignUpScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
        composable<AuthRoutes.ForgotPassword> {backstackEntry ->

            val viewModel: AuthViewModel = navController
                .sharedViewModel(backstackEntry, AuthRoutes.Auth)

            ForgotPasswordScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
    }
}