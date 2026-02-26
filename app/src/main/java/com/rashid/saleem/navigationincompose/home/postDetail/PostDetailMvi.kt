package com.rashid.saleem.navigationincompose.home.postDetail

import android.os.Bundle

sealed interface PostDetailAction {
    data object UpdateOnClick: PostDetailAction
    data object DeleteOnClick: PostDetailAction
    data object BackOnClick: PostDetailAction
}

sealed interface PostDetailEvent {
    data object NavigateBack: PostDetailEvent
    data class ShowToast(val message: String): PostDetailEvent
}