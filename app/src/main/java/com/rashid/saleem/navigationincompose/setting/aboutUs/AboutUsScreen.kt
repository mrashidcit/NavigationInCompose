package com.rashid.saleem.navigationincompose.setting.aboutUs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AboutUsScreen(
    navigateBack: () -> Unit
) {
    AboutUsContent(
        navigateBack = navigateBack
    )
}