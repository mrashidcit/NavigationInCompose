package com.rashid.saleem.navigationincompose.setting.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.rashid.saleem.navigationincompose.Routes

@Composable
fun MainScreen(
    navigateNext: (Routes) -> Unit,
    navigateBack: () -> Unit
) {
    val uiState = remember {
        SettingOptions.entries
    }

    MainContent(
        uiState = uiState,
        itemOnClick = { option ->
            val route = when (option) {
                SettingOptions.ManageSubscription -> Routes.ManageSubscription
                SettingOptions.ChangeLanguage -> Routes.SelectLanguage
                SettingOptions.FAQs -> Routes.FAQs
                SettingOptions.ContactUs -> Routes.ContactUs
                SettingOptions.AboutUs -> Routes.AboutUs
            }

            navigateNext(route)
        },
        navigateBack = navigateBack
    )



}