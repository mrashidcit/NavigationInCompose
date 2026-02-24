package com.rashid.saleem.navigationincompose.setting.faqs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rashid.saleem.navigationincompose.setting.SettingViewModel

@Composable
fun FAQScreen(
    viewModel: SettingViewModel,
    navigateBack: () -> Unit
) {

    FAQContent(
        navigateBack = navigateBack
    )
}