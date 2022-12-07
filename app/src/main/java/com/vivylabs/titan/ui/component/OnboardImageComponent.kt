package com.vivylabs.titan.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun OnboardImageComponent(@DrawableRes image: Int) {
    Image(
        painter = painterResource(image),
        contentScale = ContentScale.FillWidth,
        contentDescription = "",
        modifier = Modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.large)
    )
}