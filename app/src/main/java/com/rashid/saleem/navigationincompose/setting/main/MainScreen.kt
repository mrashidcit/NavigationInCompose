package com.rashid.saleem.navigationincompose.setting.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(
    navigateNext: () -> Unit,
    navigateBack: () -> Unit
) {
    val uiState = remember {
        SettingOptions.entries
    }

    MainContent(
        uiState = uiState,
        itemOnClick = { option ->
            when (option) {
                SettingOptions.ManageSubscription -> TODO()
                SettingOptions.ChangeLanguage -> TODO()
                SettingOptions.FAQs -> TODO()
                SettingOptions.ContactUs -> TODO()
                SettingOptions.AboutUs -> TODO()
            }

        },
        navigateBack = { }
    )



}