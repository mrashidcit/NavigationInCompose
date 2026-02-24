package com.rashid.saleem.navigationincompose.home

import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {
    private val tag = "HomeViewModel"

    init {
        Log.d(tag, "$tag - init: ")

    }


    override fun onCleared() {
        super.onCleared()
        Log.d(tag, "$tag - onCleared: ")

    }

}