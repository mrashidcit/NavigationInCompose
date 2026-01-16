package com.rashid.saleem.navigationincompose.auth.signUp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SignUpScreen(
    navigateBack: () -> Unit,
) {
    SignUpContent(
        navigateBack = navigateBack
    )
}