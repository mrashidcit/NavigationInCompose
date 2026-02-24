package com.rashid.saleem.navigationincompose.auth

import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.rashid.saleem.navigationincompose.auth.forgotPassword.ForgotPasswordScreen
import com.rashid.saleem.navigationincompose.auth.login.LoginScreen
import com.rashid.saleem.navigationincompose.auth.signUp.SignUpScreen
import com.rashid.saleem.navigationincompose.home.HomeRoutes

fun NavGraphBuilder.authScreens(navController: NavHostController) {

    navigation<AuthRoutes.Auth>(
        startDestination = AuthRoutes.Login
    ) {

        composable<AuthRoutes.Login> { backstackEntry ->

            val parentRoute = remember(backstackEntry) {
                navController.getBackStackEntry(AuthRoutes.Auth)
            }

            val viewModel: AuthViewModel = viewModel(parentRoute)

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

            val parentRoute = remember(backstackEntry) {
                navController.getBackStackEntry(AuthRoutes.Auth)
            }

            val viewModel: AuthViewModel = viewModel(parentRoute)

            SignUpScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
        composable<AuthRoutes.ForgotPassword> {backstackEntry ->

            val parentRoute = remember(backstackEntry) {
                navController.getBackStackEntry(AuthRoutes.Auth)
            }

            val viewModel: AuthViewModel = viewModel(parentRoute)

            ForgotPasswordScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
    }
}