package com.rashid.saleem.navigationincompose.home.postlListing

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rashid.saleem.navigationincompose.core.BaseRoute
import com.rashid.saleem.navigationincompose.home.HomeRoutes
import com.rashid.saleem.navigationincompose.home.postlListing.components.PostListingContent

@Composable
fun PostListingScreen(
    viewModel: PostListingViewModel = viewModel(),
    navigateNext: (BaseRoute) -> Unit
) {
    val posts = viewModel.posts

    PostListingContent(
        posts = posts,
        itemOnClick = { post ->

            navigateNext(HomeRoutes.PostDetail(post.id))
        }
    )
}