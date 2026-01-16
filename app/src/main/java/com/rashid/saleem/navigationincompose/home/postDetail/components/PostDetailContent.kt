package com.rashid.saleem.navigationincompose.home.postDetail.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.ui.theme.NavigationInComposeTheme

@Composable
fun PostDetailContent(
    post: PostModel,
    modifier: Modifier = Modifier,
    backOnClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(
                vertical = 8.dp
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(
                onClick = backOnClick,
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = null,
                )
            }
        }
        AsyncImage(
            model = post.image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.FillBounds
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = post.title,
            modifier = Modifier.padding(
                horizontal = 8.dp,
            ),
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = post.description,
            modifier = Modifier.padding(
                horizontal = 8.dp,
            ),
            style = MaterialTheme.typography.bodyMedium
        )
    }

}

@Preview
@Composable
private fun PostDetailContentPreview() {

    val postModel = remember {
        PostModel(
            id = "101",
            title = "Exploring the Wonders of the Deep Sea",
            description = "Venture into the mysterious and largely unexplored realm of the deep sea. We'll shine a light on the incredible organisms that thrive under immense pressure and in total darkness, from bioluminescent fish to giant squids. Learn about the technological challenges of deep-sea exploration and the vital ecological role these extreme environments play in planetary health. Discover how scientists are using remotely operated vehicles (ROVs) to uncover secrets hidden miles beneath the surface, revealing new species and geological phenomena. This fascinating ecosystem holds countless secrets waiting to be found.",
            image = "https://images.pexels.com/photos/11181297/pexels-photo-11181297.jpeg" // Relevant: A shark swimming in the deep blue ocean.
        )
    }

    NavigationInComposeTheme {
        Surface {
            PostDetailContent(
                post = postModel,
                backOnClick = { }
            )
        }
    }
}


















