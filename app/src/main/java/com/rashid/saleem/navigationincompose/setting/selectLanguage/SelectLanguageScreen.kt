package com.rashid.saleem.navigationincompose.setting.selectLanguage

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rashid.saleem.navigationincompose.setting.SettingViewModel

@Composable
fun SelectLanguageScreen(
    viewModel: SettingViewModel,
    navigateBack: () -> Unit
) {
    SelectLanguageContent(
        navigateBack = navigateBack
    )
}