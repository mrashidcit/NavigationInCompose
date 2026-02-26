package com.rashid.saleem.navigationincompose.core.extensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController

@Composable
inline fun <reified T: ViewModel>NavHostController.sharedViewModel(backstackEntry: NavBackStackEntry, route: Any): T {
    val parentRoute = remember(backstackEntry) {
        getBackStackEntry(route)
    }

    return viewModel(parentRoute)
}