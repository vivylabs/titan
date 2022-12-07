package com.vivylabs.titan.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.pager.ExperimentalPagerApi
import com.vivylabs.titan.ui.screen.OnboardScreen

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainSurfaceComponent() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.secondary)
    ) {
        OnboardScreen()
    }
}