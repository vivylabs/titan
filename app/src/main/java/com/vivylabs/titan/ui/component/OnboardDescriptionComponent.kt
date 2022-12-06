package com.vivylabs.titan.ui.component

import androidx.annotation.StringRes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign

@Composable
fun OnboardDescriptionComponent(@StringRes description: Int) {
    Text(
        text = stringResource(description),
        textAlign = TextAlign.Center,
    )
}