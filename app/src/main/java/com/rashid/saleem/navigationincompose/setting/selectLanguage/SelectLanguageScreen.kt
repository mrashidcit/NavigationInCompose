package com.rashid.saleem.navigationincompose.setting.selectLanguage

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SelectLanguageScreen(
    navigateBack: () -> Unit
) {
    SelectLanguageContent(
        navigateBack = navigateBack
    )
}