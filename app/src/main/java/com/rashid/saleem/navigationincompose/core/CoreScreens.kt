package com.rashid.saleem.navigationincompose.core

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.rashid.saleem.navigationincompose.core.screenA.ScreenA
import com.rashid.saleem.navigationincompose.core.screenB.ScreenB
import com.rashid.saleem.navigationincompose.core.splash.SplashScreen

fun NavGraphBuilder.coreScreens(navController: NavHostController) {
    composable<CoreRoutes.Splash> {
        SplashScreen { route ->
            navController.navigate(route) {
                popUpTo(CoreRoutes.Splash) {
                    inclusive = true
                }
            }
        }
    }
    composable<CoreRoutes.ScreenA> {
        ScreenA(
            navigateNext = { route ->
                navController.navigate(route)
            }
        )
    }
    composable<CoreRoutes.ScreenB> {
        ScreenB(
            navigateBack = {
                navController.navigateUp()
            }
        )
    }
}