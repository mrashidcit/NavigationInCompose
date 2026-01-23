package com.rashid.saleem.navigationincompose.setting

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.rashid.saleem.navigationincompose.setting.aboutUs.AboutUsScreen
import com.rashid.saleem.navigationincompose.setting.contactUs.ContactUsScreen
import com.rashid.saleem.navigationincompose.setting.faqs.FAQScreen
import com.rashid.saleem.navigationincompose.setting.main.MainScreen
import com.rashid.saleem.navigationincompose.setting.manageSubscription.ManageSubscriptionScreen
import com.rashid.saleem.navigationincompose.setting.selectLanguage.SelectLanguageScreen

fun NavGraphBuilder.settingScreens(navController: NavHostController) {
    composable<SettingRoutes.Main> {
        MainScreen(
            navigateNext = { route ->
                navController.navigate(route)
            },
            navigateBack = {
                navController.navigateUp()
            }
        )
    }
    composable<SettingRoutes.SelectLanguage> {
        SelectLanguageScreen {
            navController.navigateUp()
        }
    }
    composable<SettingRoutes.ManageSubscription> {
        ManageSubscriptionScreen {
            navController.navigateUp()
        }
    }
    composable<SettingRoutes.FAQs> {
        FAQScreen {
            navController.navigateUp()
        }
    }
    composable<SettingRoutes.ContactUs> {
        ContactUsScreen {
            navController.navigateUp()
        }
    }
    composable<SettingRoutes.AboutUs> {
        AboutUsScreen {
            navController.navigateUp()
        }
    }
}