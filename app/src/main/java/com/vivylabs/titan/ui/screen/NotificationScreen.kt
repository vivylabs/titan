package com.vivylabs.titan.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun NotificationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            "Notification Screen",
            fontSize = 16.sp
        )
    }
}