package com.rashid.saleem.navigationincompose.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rashid.saleem.navigationincompose.ui.theme.NavigationInComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TopAppBar(
            title = {
                Text("Home")
            },
            navigationIcon = {
                IconButton(
                    onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }
            }
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {

    NavigationInComposeTheme {
        Surface {
            HomeScreen()
        }
    }

}





















