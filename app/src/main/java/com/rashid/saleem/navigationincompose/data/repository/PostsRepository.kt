package com.rashid.saleem.navigationincompose.data.repository

import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.data.models.Resource
import com.rashid.saleem.navigationincompose.data.models.dummyPostsList

interface PostsRepository {

    fun get(id: String): Resource<PostModel>

    fun update(value: PostModel)

    fun delete(id: String)


    fun getAll(): Resource<List<PostModel>>

    companion object {
        val instance: PostsRepository by lazy { PostsRepositoryImpl() }

    }


}


class PostsRepositoryImpl: PostsRepository {

    private val posts = dummyPostsList

    override fun get(id: String): Resource<PostModel> {
        val item = posts.firstOrNull { it.id == id } ?: return Resource.Error(message = "Not found")

        return Resource.Success(item)
    }

    override fun update(value: PostModel) {
        val itemIndex = posts.indexOfFirst { it.id == value.id }
        if (itemIndex != -1) {
            posts[itemIndex] = value
        }
    }

    override fun delete(id: String) {
        val itemIndex = posts.indexOfFirst { it.id == id }
        if (itemIndex != -1) {
            posts.removeAt(itemIndex)
        }
    }

    override fun getAll(): Resource<List<PostModel>> {

        return Resource.Success(posts)
    }
}