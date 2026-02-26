package com.rashid.saleem.navigationincompose.home.postlListing

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import com.rashid.saleem.navigationincompose.core.BaseRoutes
import com.rashid.saleem.navigationincompose.home.HomeRoutes
import com.rashid.saleem.navigationincompose.home.HomeViewModel
import com.rashid.saleem.navigationincompose.home.postlListing.components.PostListingContent
import com.rashid.saleem.navigationincompose.setting.SettingRoutes

@Composable
fun PostListingScreen(
    homeViewModel: HomeViewModel,
    backStackEntry: NavBackStackEntry,
    viewModel: PostListingViewModel = viewModel(),
    navigateNext: (BaseRoutes) -> Unit
) {
    val posts = viewModel.posts

    /**
    LaunchedEffect(true) {
        backStackEntry.savedStateHandle
            .getStateFlow("refresh-listing", false)
            .collect { value ->
                if (value) viewModel.fetchPosts(true)
            }
    }
    */

    PostListingContent(
        posts = posts,
        itemOnClick = { post ->
            navigateNext(HomeRoutes.PostDetail(post.id))
        },
        openSetting = {
            navigateNext(SettingRoutes.Main)
        }
    )
}