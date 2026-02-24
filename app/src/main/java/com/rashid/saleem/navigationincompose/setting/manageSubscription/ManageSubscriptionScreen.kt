package com.rashid.saleem.navigationincompose.setting.manageSubscription

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rashid.saleem.navigationincompose.setting.SettingViewModel

@Composable
fun ManageSubscriptionScreen(
    viewModel: SettingViewModel,
    navigateBack: () -> Unit
) {
    ManageSubscriptionContent(
        navigateBack = navigateBack
    )
}