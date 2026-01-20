package com.rashid.saleem.navigationincompose.setting.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.rashid.saleem.navigationincompose.core.BaseRoute
import com.rashid.saleem.navigationincompose.setting.SettingRoutes

@Composable
fun MainScreen(
    navigateNext: (BaseRoute) -> Unit,
    navigateBack: () -> Unit
) {
    val uiState = remember {
        SettingOptions.entries
    }

    MainContent(
        uiState = uiState,
        itemOnClick = { option ->
            val route = when (option) {
                SettingOptions.ManageSubscription -> SettingRoutes.ManageSubscription
                SettingOptions.ChangeLanguage -> SettingRoutes.SelectLanguage
                SettingOptions.FAQs -> SettingRoutes.FAQs
                SettingOptions.ContactUs -> SettingRoutes.ContactUs
                SettingOptions.AboutUs -> SettingRoutes.AboutUs
            }

            navigateNext(route)
        },
        navigateBack = navigateBack
    )



}