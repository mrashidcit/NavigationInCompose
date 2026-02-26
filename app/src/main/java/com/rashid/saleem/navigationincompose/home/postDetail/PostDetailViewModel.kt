package com.rashid.saleem.navigationincompose.home.postDetail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.rashid.saleem.navigationincompose.core.CoreRoutes
import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.data.repository.PostsRepository
import com.rashid.saleem.navigationincompose.data.repository.PostsRepositoryImpl
import com.rashid.saleem.navigationincompose.home.HomeRoutes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class PostDetailViewModel(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    val repository: PostsRepository = PostsRepositoryImpl()

    private val _post = MutableStateFlow(PostModel.empty)
    val post: StateFlow<PostModel> = _post.asStateFlow()

    private val _events = MutableSharedFlow<PostDetailEvent>()
    val events: SharedFlow<PostDetailEvent> = _events

    init {

        val args = savedStateHandle.toRoute<HomeRoutes.PostDetail>()

        val result = repository.get(args.postId)

        if (result.data != null) {
            _post.update {
                result.data
            }
        }
    }

    fun onAction(action: PostDetailAction) {
        when (action) {
            PostDetailAction.BackOnClick -> navigateBack()
            PostDetailAction.DeleteOnClick -> deletePost()
            PostDetailAction.UpdateOnClick -> updatePost()
        }
    }

    private fun updatePost() {

        showToast("Successfully Updated.")
        navigateBack()
    }

    private fun deletePost() {

        showToast("Successfully Deleted.")
        navigateBack()
    }

    private fun navigateBack() {
        emitEvent(PostDetailEvent.NavigateBack)
    }

    fun showToast(message: String) {
        val event = PostDetailEvent.ShowToast(message)
        emitEvent(event)
    }

    private fun emitEvent(event: PostDetailEvent) = viewModelScope.launch(Dispatchers.Main) {
        _events.emit(event)
    }











}