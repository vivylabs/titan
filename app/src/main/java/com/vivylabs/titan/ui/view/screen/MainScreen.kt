package com.vivylabs.titan.ui.view.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.vivylabs.titan.ui.view.component.BottomAppBarComponent
import com.vivylabs.titan.ui.view.component.NavHostComponent

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomAppBarComponent(navController) },
    ) {
        Modifier.padding(it)
        NavHostComponent(navController)
    }
}