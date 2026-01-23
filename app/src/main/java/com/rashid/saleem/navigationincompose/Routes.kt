package com.rashid.saleem.navigationincompose

import kotlinx.serialization.Serializable

@Serializable
sealed interface Routes {

    // Total Screens : 18

    /**
     *  ******** Core *********
     */
    @Serializable
    data object Splash: Routes
    @Serializable
    data object ScreenA: Routes
    @Serializable
    data class ScreenB(
        val userId: Int
    ): Routes



    /**
     *  ******** Auth *********
     */
    @Serializable
    data object Login: Routes
    @Serializable
    data object SignUp: Routes
    @Serializable
    data object ForgotPassword: Routes



    /**
     *  ******** Home *********
     */
    @Serializable
    data object PostListing: Routes
    @Serializable
    data class PostDetail(
        val postId: String
    ): Routes


    /**
     *  ******** Setting *********
     */
    @Serializable
    data object SettingMain: Routes
    @Serializable
    data object SelectLanguage: Routes
    @Serializable
    data object ManageSubscription: Routes
    @Serializable
    data object FAQs: Routes
    @Serializable
    data object ContactUs: Routes
    @Serializable
    data object AboutUs: Routes






}