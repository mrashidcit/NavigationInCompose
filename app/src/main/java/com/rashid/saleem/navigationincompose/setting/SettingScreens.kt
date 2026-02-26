package com.rashid.saleem.navigationincompose.setting

import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.rashid.saleem.navigationincompose.core.extensions.sharedViewModel
import com.rashid.saleem.navigationincompose.setting.aboutUs.AboutUsScreen
import com.rashid.saleem.navigationincompose.setting.contactUs.ContactUsScreen
import com.rashid.saleem.navigationincompose.setting.faqs.FAQScreen
import com.rashid.saleem.navigationincompose.setting.main.MainScreen
import com.rashid.saleem.navigationincompose.setting.manageSubscription.ManageSubscriptionScreen
import com.rashid.saleem.navigationincompose.setting.selectLanguage.SelectLanguageScreen

fun NavGraphBuilder.settingScreens(navController: NavHostController) {

    navigation<SettingRoutes.Setting>(
        startDestination = SettingRoutes.Main
    ) {
        composable<SettingRoutes.Main> { backstackEntry ->

            val viewModel: SettingViewModel = navController
                .sharedViewModel(backstackEntry, SettingRoutes.Setting)

            MainScreen(
                viewModel = viewModel,
                navigateNext = { route ->
                    navController.navigate(route)
                },
                navigateBack = {
                    navController.navigateUp()
                }
            )
        }
        composable<SettingRoutes.SelectLanguage> {backstackEntry ->

            val viewModel: SettingViewModel = navController
                .sharedViewModel(backstackEntry, SettingRoutes.Setting)

            SelectLanguageScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
        composable<SettingRoutes.ManageSubscription> {backstackEntry ->

            val viewModel: SettingViewModel = navController
                .sharedViewModel(backstackEntry, SettingRoutes.Setting)

            ManageSubscriptionScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
        composable<SettingRoutes.FAQs> {backstackEntry ->

            val viewModel: SettingViewModel = navController
                .sharedViewModel(backstackEntry, SettingRoutes.Setting)

            FAQScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
        composable<SettingRoutes.ContactUs> {backstackEntry ->

            val viewModel: SettingViewModel = navController
                .sharedViewModel(backstackEntry, SettingRoutes.Setting)

            ContactUsScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
        composable<SettingRoutes.AboutUs> {backstackEntry ->

            val viewModel: SettingViewModel = navController
                .sharedViewModel(backstackEntry, SettingRoutes.Setting)

            AboutUsScreen(
                viewModel = viewModel,
            ) {
                navController.navigateUp()
            }
        }
    }


}