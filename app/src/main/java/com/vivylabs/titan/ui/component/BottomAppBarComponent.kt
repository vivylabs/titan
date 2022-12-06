package com.vivylabs.titan.ui.component

import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.vivylabs.titan.ui.data.bottomAppBarItemList

@Composable
fun BottomAppBarComponent(navController: NavController) {
    BottomAppBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        bottomAppBarItemList.forEachIndexed { index, item ->
            if (index != 2) {
                BottomNavigationItem(
                    icon = { Icon(item.icon, "") },
                    selected = currentRoute == item.route,
                    onClick = {
                        navController.navigate(item.route)
                    }
                )
            } else {
                BottomNavigationItem(
                    icon = { Icon(item.icon, "") },
                    selected = false,
                    onClick = {},
                )
            }
        }
    }
}