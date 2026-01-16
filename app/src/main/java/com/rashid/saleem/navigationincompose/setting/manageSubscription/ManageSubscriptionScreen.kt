package com.rashid.saleem.navigationincompose.setting.manageSubscription

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ManageSubscriptionScreen(
    navigateBack: () -> Unit
) {
    ManageSubscriptionContent(
        navigateBack = navigateBack
    )
}