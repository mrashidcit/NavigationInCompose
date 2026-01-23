package com.rashid.saleem.navigationincompose.home.postDetail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.rashid.saleem.navigationincompose.core.CoreRoutes
import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.data.repository.PostsRepository
import com.rashid.saleem.navigationincompose.data.repository.PostsRepositoryImpl
import com.rashid.saleem.navigationincompose.home.HomeRoutes
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PostDetailViewModel(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    val repository: PostsRepository = PostsRepositoryImpl()

    private val _post = MutableStateFlow(PostModel.empty)
    val post: StateFlow<PostModel> = _post.asStateFlow()

    init {

        val args = savedStateHandle.toRoute<HomeRoutes.PostDetail>()

        val result = repository.get(args.postId)

        if (result.data != null) {
            _post.update {
                result.data
            }
        }
    }


}