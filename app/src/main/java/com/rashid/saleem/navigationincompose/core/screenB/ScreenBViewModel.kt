package com.rashid.saleem.navigationincompose.core.screenB

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.rashid.saleem.navigationincompose.core.CoreRoutes

class ScreenBViewModel(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {
    private val TAG = "ScreenBViewModel"

    init {

        /**
         * Approach 01:
         */
        /**
        val userId = savedStateHandle.get<Int>("userId")
        Log.d(TAG, "init: userId = $userId")
        */


        /**
         * Approach 02:
         */
        val params = savedStateHandle.toRoute<CoreRoutes.ScreenB>()
        Log.d(TAG, "init: userId = ${params.userId}")


    }

}









