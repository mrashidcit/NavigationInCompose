package com.rashid.saleem.navigationincompose.setting.contactUs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ContactUsScreen(
    navigateBack: () -> Unit
) {
    ContactUsContent(
        navigateBack = navigateBack
    )
}