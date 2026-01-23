package com.rashid.saleem.navigationincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rashid.saleem.navigationincompose.auth.forgotPassword.ForgotPasswordScreen
import com.rashid.saleem.navigationincompose.auth.login.LoginScreen
import com.rashid.saleem.navigationincompose.auth.signUp.SignUpScreen
import com.rashid.saleem.navigationincompose.home.postDetail.PostDetailScreen
import com.rashid.saleem.navigationincompose.home.postlListing.PostListingScreen
import com.rashid.saleem.navigationincompose.screenA.ScreenA
import com.rashid.saleem.navigationincompose.screenB.ScreenB
import com.rashid.saleem.navigationincompose.setting.aboutUs.AboutUsScreen
import com.rashid.saleem.navigationincompose.setting.contactUs.ContactUsScreen
import com.rashid.saleem.navigationincompose.setting.faqs.FAQScreen
import com.rashid.saleem.navigationincompose.setting.main.MainScreen
import com.rashid.saleem.navigationincompose.setting.manageSubscription.ManageSubscriptionScreen
import com.rashid.saleem.navigationincompose.setting.selectLanguage.SelectLanguageScreen
import com.rashid.saleem.navigationincompose.splash.SplashScreen
import com.rashid.saleem.navigationincompose.ui.theme.NavigationInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationInComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Box (
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        val navController = rememberNavController()

                        NavHost(
                            navController = navController,
                            startDestination = Routes.Splash
                        ) {

                            /**
                             *  ******** Core *********
                             */
                            composable<Routes.Splash> {
                                SplashScreen { route ->
                                    navController.navigate(route) {
                                        popUpTo(Routes.Splash) {
                                            inclusive = true
                                        }
                                    }
                                }
                            }
                            composable<Routes.ScreenA> {
                                ScreenA(
                                    navigateNext = { route ->
                                        navController.navigate(route)
                                    }
                                )
                            }
                            composable<Routes.ScreenB> {
                                ScreenB(
                                    navigateBack = {
                                        navController.navigateUp()
                                    }
                                )
                            }


                            /**
                             *  ******** Auth *********
                             */
                            composable<Routes.Login> {
                                LoginScreen { route ->
                                    navController.navigate(route) {
                                        if (route is Routes.PostListing) {
                                            popUpTo(Routes.Login) {
                                                inclusive = true
                                            }
                                        }
                                    }
                                }
                            }
                            composable<Routes.SignUp> {
                                SignUpScreen {
                                    navController.navigateUp()
                                }
                            }
                            composable<Routes.ForgotPassword> {
                                ForgotPasswordScreen {
                                    navController.navigateUp()
                                }
                            }

                            /**
                             *  ******** Home *********
                             */
                            composable<Routes.PostListing> {
                                PostListingScreen(
                                    navigateNext = { route ->
                                        navController.navigate(route)
                                    }
                                )
                            }
                            composable<Routes.PostDetail> {
                                PostDetailScreen(
                                    navigateBack = {
                                        navController.navigateUp()
                                    }
                                )
                            }


                            /**
                             *  ******** Setting *********
                             */
                            composable<Routes.SettingMain> {
                                MainScreen(
                                    navigateNext = { route ->
                                        navController.navigate(route)
                                    },
                                    navigateBack = {
                                        navController.navigateUp()
                                    }
                                )
                            }
                            composable<Routes.SelectLanguage> {
                                SelectLanguageScreen {
                                    navController.navigateUp()
                                }
                            }
                            composable<Routes.ManageSubscription> {
                                ManageSubscriptionScreen {
                                    navController.navigateUp()
                                }
                            }
                            composable<Routes.FAQs> {
                                FAQScreen {
                                    navController.navigateUp()
                                }
                            }
                            composable<Routes.ContactUs> {
                                ContactUsScreen {
                                    navController.navigateUp()
                                }
                            }
                            composable<Routes.AboutUs> {
                                AboutUsScreen {
                                    navController.navigateUp()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
