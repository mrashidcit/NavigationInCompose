package com.rashid.saleem.navigationincompose.home

import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.rashid.saleem.navigationincompose.home.postDetail.PostDetailScreen
import com.rashid.saleem.navigationincompose.home.postlListing.PostListingScreen

fun NavGraphBuilder.homeScreens(navController: NavHostController) {

    navigation<HomeRoutes.Home>(
        startDestination = HomeRoutes.PostListing
    ) {
        composable<HomeRoutes.PostListing> { backStackEntry ->

            val parentRoute = remember(backStackEntry) {
                navController.getBackStackEntry(HomeRoutes.Home)
            }

            val homeViewModel: HomeViewModel = viewModel(parentRoute)

            PostListingScreen(
                homeViewModel = homeViewModel,
                navigateNext = { route ->
                    navController.navigate(route)
                }
            )
        }
        composable<HomeRoutes.PostDetail> { backStackEntry ->

            val parentRoute = remember(backStackEntry) {
                navController.getBackStackEntry(HomeRoutes.Home)
            }

            val homeViewModel: HomeViewModel = viewModel(parentRoute)

            PostDetailScreen(
                homeViewModel = homeViewModel,
                navigateBack = {
                    navController.navigateUp()
                }
            )
        }
    }
}