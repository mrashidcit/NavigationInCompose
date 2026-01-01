package com.rashid.saleem.navigationincompose

import kotlinx.serialization.Serializable

@Serializable
sealed interface Routes {

    @Serializable
    data object ScreenA: Routes

    @Serializable
    data class ScreenB(
        val userId: Int
    ): Routes


    /**
     *  ******** Posts *********
     */
    @Serializable
    data object PostListing: Routes

    @Serializable
    data class PostDetail(
        val postId: String
    ): Routes


    /**
     *  ******** Common *********
     */
    @Serializable
    data object Splash: Routes



    /**
     *  ******** Auth *********
     */
    @Serializable
    data object Login: Routes

    @Serializable
    data object ForgotPassword: Routes


    /**
     *  ******** Home *********
     */
    @Serializable
    data object Home: Routes





}