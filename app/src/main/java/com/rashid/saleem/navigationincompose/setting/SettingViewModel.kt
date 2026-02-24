package com.rashid.saleem.navigationincompose.setting

import android.util.Log
import androidx.lifecycle.ViewModel

class SettingViewModel: ViewModel() {
    private val tag = "SettingViewModel"

    init {
        Log.d(tag, "$tag - init: ")

    }


    override fun onCleared() {
        super.onCleared()
        Log.d(tag, "$tag - onCleared: ")

    }

}