package com.rashid.saleem.navigationincompose.posts.listing.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.rashid.saleem.navigationincompose.data.models.PostModel
import com.rashid.saleem.navigationincompose.data.models.dummyPostsList
import com.rashid.saleem.navigationincompose.ui.theme.NavigationInComposeTheme

@Composable
fun PostListingContent(
    posts: List<PostModel>,
    modifier: Modifier = Modifier,
    itemOnClick: (PostModel) -> Unit,
) {

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(
            vertical = 12.dp,
            horizontal = 12.dp
        )
    ) {
        items(posts) { post ->
            ListItem(
                post = post,
                onClick = {
                    itemOnClick(post)
                }
            )
        }
    }


}

@Composable
private fun ListItem(
    post: PostModel,
    onClick: () -> Unit,
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {

            AsyncImage(
                model = post.image,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(
                        end = 6.dp
                    )
                    .clip(RoundedCornerShape(6.dp)),
                contentScale = ContentScale.FillBounds
            )

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = post.title,
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = post.description,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }

        }
    }
}

@Preview
@Composable
private fun PostListingContentPreview() {

    val posts = remember {
        dummyPostsList
    }

    NavigationInComposeTheme {
        Surface {
            PostListingContent(
                posts = posts,
                itemOnClick = { }
            )
        }
    }
}











