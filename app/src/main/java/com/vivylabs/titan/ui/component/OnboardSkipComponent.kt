package com.vivylabs.titan.ui.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.vivylabs.titan.R

@Composable
fun OnboardSkipComponent() {
    Text(
        text = stringResource(R.string.onboard_skip_button),
        color = Color.DarkGray
    )
}