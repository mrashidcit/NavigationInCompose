package com.rashid.saleem.navigationincompose.home.postDetail

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rashid.saleem.navigationincompose.home.postDetail.components.PostDetailContent

@Composable
fun PostDetailScreen(
    viewModel: PostDetailViewModel = viewModel(),
    navigateBack: () -> Unit
) {
    val post by viewModel.post.collectAsStateWithLifecycle()

    PostDetailContent(
        post = post,
        backOnClick = navigateBack
    )

}