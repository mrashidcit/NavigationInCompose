package com.rashid.saleem.navigationincompose.auth

import android.util.Log
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {
    private val tag = "AuthViewModel"


    init {
        Log.d(tag, "$tag - init: ")

    }


    override fun onCleared() {
        super.onCleared()
        Log.d(tag, "$tag - onCleared: ")

    }
}