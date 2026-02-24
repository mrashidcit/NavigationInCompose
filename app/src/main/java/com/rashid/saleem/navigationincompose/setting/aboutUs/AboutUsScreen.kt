package com.rashid.saleem.navigationincompose.setting.aboutUs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rashid.saleem.navigationincompose.setting.SettingViewModel

@Composable
fun AboutUsScreen(
    viewModel: SettingViewModel,
    navigateBack: () -> Unit
) {
    AboutUsContent(
        navigateBack = navigateBack
    )
}