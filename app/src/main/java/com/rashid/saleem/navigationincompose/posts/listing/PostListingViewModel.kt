package com.rashid.saleem.navigationincompose.posts.listing

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.data.models.Resource
import com.rashid.saleem.navigationincompose.data.repository.PostsRepositoryImpl

class PostListingViewModel: ViewModel() {

    private val repository = PostsRepositoryImpl()
    private val _posts = mutableStateListOf<PostModel>()
    val posts: List<PostModel>
        get() = _posts



    init {

        val result = repository.getAll()
        if (result.data != null) {
            _posts.addAll(result.data)
        }
    }



}