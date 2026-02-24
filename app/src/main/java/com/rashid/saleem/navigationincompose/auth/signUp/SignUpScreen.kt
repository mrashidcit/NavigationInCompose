package com.rashid.saleem.navigationincompose.auth.signUp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rashid.saleem.navigationincompose.auth.AuthViewModel

@Composable
fun SignUpScreen(
    viewModel: AuthViewModel,
    navigateBack: () -> Unit,
) {
    SignUpContent(
        navigateBack = navigateBack
    )
}