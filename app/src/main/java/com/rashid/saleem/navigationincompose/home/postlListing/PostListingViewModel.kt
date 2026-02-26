package com.rashid.saleem.navigationincompose.home.postlListing

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.data.repository.PostsRepository
import com.rashid.saleem.navigationincompose.data.repository.PostsRepositoryImpl
import com.rashid.saleem.navigationincompose.data.repository.SharedRepository
import kotlinx.coroutines.launch

class PostListingViewModel(
    private val savedStateHandle: SavedStateHandle,
): ViewModel() {

    private val tag = "PostListingViewModel"
    private val repository: PostsRepository = PostsRepository.instance
    private val sharedRepository: SharedRepository = SharedRepository.instance

    private val _posts = mutableStateListOf<PostModel>()
    val posts: List<PostModel>
        get() = _posts



    init {

        fetchPosts(true)

        viewModelScope.launch {
            sharedRepository
                .postUpdates
                .collect {
                    fetchPosts(true)
                }

        }

        /**
        viewModelScope.launch {
            savedStateHandle.getStateFlow("refresh-listing", false)
                .collect { value ->
                    Log.d(tag, "init: refresh-listing = $value")

                    if (value) fetchPosts()
                }
        }
        */

    }

    fun fetchPosts(shouldLoadFirstPage: Boolean = false) {
        if (shouldLoadFirstPage) _posts.clear()
        val result = repository.getAll()
        if (result.data != null) {
            _posts.addAll(result.data)
        }
    }


}