package com.rashid.saleem.navigationincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rashid.saleem.navigationincompose.auth.forgotPassword.ForgotPasswordScreen
import com.rashid.saleem.navigationincompose.auth.login.LoginScreen
import com.rashid.saleem.navigationincompose.home.HomeScreen
import com.rashid.saleem.navigationincompose.posts.detail.PostDetailScreen
import com.rashid.saleem.navigationincompose.posts.listing.PostListingScreen
import com.rashid.saleem.navigationincompose.screenA.ScreenA
import com.rashid.saleem.navigationincompose.screenB.ScreenB
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

                            composable<Routes.Splash> {
                                SplashScreen { route ->
                                    navController.navigate(route) {
                                        popUpTo(Routes.Splash) {
                                            inclusive = true
                                        }
                                    }
                                }
                            }

                            /**
                             *  ******** Auth *********
                             */
                            composable<Routes.Login> {
                                LoginScreen { route ->
                                    navController.navigate(route) {
                                        if (route is Routes.Home) {
                                            popUpTo(Routes.Login) {
                                                inclusive = true
                                            }
                                        }
                                    }
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
                            composable<Routes.Home> {
                                HomeScreen()
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
                             *  ******** Posts *********
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
                             *  ******** Auth *********
                             */



                        }

                    }
                }
            }
        }
    }
}
