package com.rashid.saleem.navigationincompose.setting.contactUs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rashid.saleem.navigationincompose.setting.SettingViewModel

@Composable
fun ContactUsScreen(
    viewModel: SettingViewModel,
    navigateBack: () -> Unit
) {
    ContactUsContent(
        navigateBack = navigateBack
    )
}