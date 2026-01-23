package com.rashid.saleem.navigationincompose.core.screenA

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rashid.saleem.navigationincompose.core.CoreRoutes

@Composable
fun ScreenA(
    navigateNext: (CoreRoutes) -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Screen A",
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                val route = CoreRoutes.ScreenB(
                    userId = 20
                )
                navigateNext(route)
            }
        ) {
            Text("Next")
        }


    }

}