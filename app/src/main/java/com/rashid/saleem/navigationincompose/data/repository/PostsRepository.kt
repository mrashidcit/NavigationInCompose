package com.rashid.saleem.navigationincompose.data.repository

import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.data.models.Resource
import com.rashid.saleem.navigationincompose.data.models.dummyPostsList

interface PostsRepository {

    fun get(id: String): Resource<PostModel>

    fun getAll(): Resource<List<PostModel>>

}


class PostsRepositoryImpl: PostsRepository {

    private val posts = dummyPostsList

    override fun get(id: String): Resource<PostModel> {
        val item = posts.firstOrNull { it.id == id } ?: return Resource.Error(message = "Not found")

        return Resource.Success(item)
    }

    override fun getAll(): Resource<List<PostModel>> {

        return Resource.Success(posts)
    }
}