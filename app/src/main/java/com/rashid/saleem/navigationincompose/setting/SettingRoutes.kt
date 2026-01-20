package com.rashid.saleem.navigationincompose.setting

import com.rashid.saleem.navigationincompose.core.BaseRoute
import kotlinx.serialization.Serializable

sealed class SettingRoutes: BaseRoute {

    @Serializable
    data object Main: SettingRoutes()

    @Serializable
    data object SelectLanguage: SettingRoutes()

    @Serializable
    data object ManageSubscription: SettingRoutes()

    @Serializable
    data object FAQs: SettingRoutes()

    @Serializable
    data object ContactUs: SettingRoutes()

    @Serializable
    data object AboutUs: SettingRoutes()

}