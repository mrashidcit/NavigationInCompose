package com.rashid.saleem.navigationincompose.home.postDetail

import androidx.core.os.bundleOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.rashid.saleem.navigationincompose.core.CoreRoutes
import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.data.repository.PostsRepository
import com.rashid.saleem.navigationincompose.data.repository.PostsRepositoryImpl
import com.rashid.saleem.navigationincompose.data.repository.SharedRepository
import com.rashid.saleem.navigationincompose.data.repository.SharedRepositoryImpl
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

    val repository: PostsRepository = PostsRepository.instance
    val sharedRepository: SharedRepository = SharedRepository.instance


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
            PostDetailAction.BackOnClick -> navigateBack(false)
            PostDetailAction.DeleteOnClick -> deletePost()
            PostDetailAction.UpdateOnClick -> updatePost()
        }
    }

    private fun updatePost() {
        val updatedPost = with(_post.value) {
            copy(
                title = "Updated - $title"
            )
        }

        repository.update(updatedPost)

        viewModelScope.launch {
            sharedRepository.notifyPostUpdated()
        }

        showToast("Successfully Updated.")
        navigateBack(true)
    }

    private fun deletePost() {

        repository.delete(_post.value.id)

        viewModelScope.launch {
            sharedRepository.notifyPostUpdated()
        }

        showToast("Successfully Deleted.")
        navigateBack(true)
    }

    private fun navigateBack(refreshListing: Boolean) {
        val params = bundleOf(
            "refresh-listing" to refreshListing
        )
        emitEvent(PostDetailEvent.NavigateBack(params))
    }

    fun showToast(message: String) {
        val event = PostDetailEvent.ShowToast(message)
        emitEvent(event)
    }

    private fun emitEvent(event: PostDetailEvent) = viewModelScope.launch(Dispatchers.Main) {
        _events.emit(event)
    }











}