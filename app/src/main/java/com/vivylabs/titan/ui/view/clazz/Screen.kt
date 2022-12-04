package com.vivylabs.titan.ui.view.clazz

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Search : Screen("search")
    object Notification : Screen("notification")
    object Profile : Screen("profile")
    object Splash : Screen("splash")
}
