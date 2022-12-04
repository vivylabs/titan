package com.vivylabs.titan.ui.view.component

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.vivylabs.titan.ui.view.clazz.Screen
import com.vivylabs.titan.ui.view.screen.*

@Composable
fun NavHostComponent(navController: NavHostController) {
    NavHost(navController, Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Profile.route) {
            ProfileScreen()
        }
        composable(Screen.Notification.route) {
            NotificationScreen()
        }
        composable(Screen.Search.route) {
            SearchScreen()
        }
        composable(Screen.Splash.route) {
            SplashScreen()
        }
    }
}