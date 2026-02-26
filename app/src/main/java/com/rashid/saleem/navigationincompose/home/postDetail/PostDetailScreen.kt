package com.rashid.saleem.navigationincompose.home.postDetail

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rashid.saleem.navigationincompose.home.HomeViewModel
import com.rashid.saleem.navigationincompose.home.postDetail.components.PostDetailContent
import kotlinx.coroutines.flow.collectLatest

@Composable
fun PostDetailScreen(
    homeViewModel: HomeViewModel,
    viewModel: PostDetailViewModel = viewModel(),
    navigateBack: () -> Unit
) {
    val post by viewModel.post.collectAsStateWithLifecycle()
    val context = LocalContext.current

    LaunchedEffect(true) {
        viewModel.events.collectLatest { event ->
            when (event) {
                PostDetailEvent.NavigateBack -> navigateBack()
                is PostDetailEvent.ShowToast -> Toast
                    .makeText(context, event.message, Toast.LENGTH_LONG)
                    .show()
            }
        }

    }

    PostDetailContent(
        post = post,
        onAction = viewModel::onAction
    )

}