package com.rashid.saleem.navigationincompose.posts.detail

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.rashid.saleem.navigationincompose.data.models.PostModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PostDetailViewModel: ViewModel() {

    private val _post = MutableStateFlow(PostModel.empty)
    val post: StateFlow<PostModel> = _post.asStateFlow()

    init {

        _post.update {
            PostModel(
                id = "101",
                title = "Exploring the Wonders of the Deep Sea",
                description = "Venture into the mysterious and largely unexplored realm of the deep sea. We'll shine a light on the incredible organisms that thrive under immense pressure and in total darkness, from bioluminescent fish to giant squids. Learn about the technological challenges of deep-sea exploration and the vital ecological role these extreme environments play in planetary health. Discover how scientists are using remotely operated vehicles (ROVs) to uncover secrets hidden miles beneath the surface, revealing new species and geological phenomena. This fascinating ecosystem holds countless secrets waiting to be found.",
                image = "https://images.pexels.com/photos/11181297/pexels-photo-11181297.jpeg" // Relevant: A shark swimming in the deep blue ocean.
            )
        }
    }


}