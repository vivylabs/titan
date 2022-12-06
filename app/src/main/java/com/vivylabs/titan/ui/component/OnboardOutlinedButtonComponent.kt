package com.vivylabs.titan.ui.component

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun OnboardOutlinedButtonComponent(@StringRes buttonText: Int) {
    OutlinedButton(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.fillMaxWidth(),
        border = BorderStroke(1.dp, Color.Black),
        contentPadding = PaddingValues(vertical = 16.dp),
        onClick = { }
    ) {
        Text(
            text = stringResource(buttonText),
            color = Color.Black
        )
    }
}