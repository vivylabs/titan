package com.vivylabs.titan.ui.view.clazz

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Nav(
    val route: String,
    val icon: ImageVector
) {
    object Home : Nav(
        route = Screen.Home.route,
        icon = Icons.Outlined.Home
    )

    object Profile : Nav(
        route = Screen.Profile.route,
        icon = Icons.Outlined.Person
    )

    object Add : Nav(
        route = "",
        icon = Icons.Default.AddCircle
    )

    object Search : Nav(
        route = Screen.Search.route,
        icon = Icons.Outlined.Search
    )

    object Notification : Nav(
        route = Screen.Notification.route,
        icon = Icons.Outlined.Email
    )
}
