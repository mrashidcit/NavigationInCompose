package com.rashid.saleem.navigationincompose.setting.faqs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FAQScreen(
    navigateBack: () -> Unit
) {

    FAQContent(
        navigateBack = navigateBack
    )
}