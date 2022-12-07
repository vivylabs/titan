package com.vivylabs.titan.ui.component

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
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
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(vertical = 20.dp),
        border = BorderStroke(1.dp, MaterialTheme.colors.primary),
        onClick = { }
    ) {
        Text(
            text = stringResource(buttonText),
            style = MaterialTheme.typography.body2,
            color = MaterialTheme.colors.primary
        )
    }
}