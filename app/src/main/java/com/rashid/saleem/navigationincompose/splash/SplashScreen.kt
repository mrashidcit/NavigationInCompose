package com.rashid.saleem.navigationincompose.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rashid.saleem.navigationincompose.R
import com.rashid.saleem.navigationincompose.Routes
import com.rashid.saleem.navigationincompose.ui.theme.NavigationInComposeTheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigateNext: (Routes) -> Unit
) {

    LaunchedEffect(true) {

        delay(3000L)
        navigateNext(Routes.Login)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.titleMedium
        )
    }
}


@Preview
@Composable
fun SplashScreenPreview() {
    NavigationInComposeTheme {
        Surface {
            SplashScreen(
                navigateNext = { }
            )
        }
    }
}





















