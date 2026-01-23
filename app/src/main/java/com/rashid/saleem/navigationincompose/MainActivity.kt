package com.rashid.saleem.navigationincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rashid.saleem.navigationincompose.auth.authScreens
import com.rashid.saleem.navigationincompose.core.CoreRoutes
import com.rashid.saleem.navigationincompose.core.coreScreens
import com.rashid.saleem.navigationincompose.home.homeScreens
import com.rashid.saleem.navigationincompose.core.screenA.ScreenA
import com.rashid.saleem.navigationincompose.core.screenB.ScreenB
import com.rashid.saleem.navigationincompose.setting.settingScreens
import com.rashid.saleem.navigationincompose.core.splash.SplashScreen
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

                        AppNavHost(navController)
                    }
                }
            }
        }
    }

    @Composable
    private fun AppNavHost(navController: NavHostController) {
        NavHost(
            navController = navController,
            startDestination = CoreRoutes.Splash
        ) {

            // Total Screens : 18

            coreScreens(navController)
            authScreens(navController)
            homeScreens(navController)
            settingScreens(navController)
        }
    }


}
