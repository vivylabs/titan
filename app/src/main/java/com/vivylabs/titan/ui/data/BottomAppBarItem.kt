package com.vivylabs.titan.ui.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.vivylabs.titan.ui.screen.Screen

sealed class BottomAppBarItem(
    val route: String,
    val icon: ImageVector
) {
    object Home : BottomAppBarItem(
        route = Screen.Home.route,
        icon = Icons.Outlined.Home
    )

    object Profile : BottomAppBarItem(
        route = Screen.Profile.route,
        icon = Icons.Outlined.Person
    )

    object Add : BottomAppBarItem(
        route = "",
        icon = Icons.Default.AddCircle
    )

    object Search : BottomAppBarItem(
        route = Screen.Search.route,
        icon = Icons.Outlined.Search
    )

    object Notification : BottomAppBarItem(
        route = Screen.Notification.route,
        icon = Icons.Outlined.Email
    )
}
