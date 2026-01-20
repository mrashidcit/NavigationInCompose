package com.rashid.saleem.navigationincompose.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.rashid.saleem.navigationincompose.home.postDetail.PostDetailScreen
import com.rashid.saleem.navigationincompose.home.postlListing.PostListingScreen

fun NavGraphBuilder.homeScreens(navController: NavHostController) {
    composable<HomeRoutes.PostListing> {
        PostListingScreen(
            navigateNext = { route ->
                navController.navigate(route)
            }
        )
    }
    composable<HomeRoutes.PostDetail> {
        PostDetailScreen(
            navigateBack = {
                navController.navigateUp()
            }
        )
    }
}