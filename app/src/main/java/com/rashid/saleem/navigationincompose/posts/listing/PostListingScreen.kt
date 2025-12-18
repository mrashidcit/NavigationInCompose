package com.rashid.saleem.navigationincompose.posts.listing

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rashid.saleem.navigationincompose.Routes
import com.rashid.saleem.navigationincompose.posts.listing.components.PostListingContent

@Composable
fun PostListingScreen(
    viewModel: PostListingViewModel = viewModel(),
    navigateNext: (Routes) -> Unit
) {
    val posts = viewModel.posts

    PostListingContent(
        posts = posts,
        itemOnClick = { post ->
            navigateNext(Routes.PostDetail)
        }
    )
}