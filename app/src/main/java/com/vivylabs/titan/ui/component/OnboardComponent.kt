package com.vivylabs.titan.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vivylabs.titan.ui.data.OnboardItem

@Composable
fun OnboardComponent(onboardItem: OnboardItem) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Box(
            modifier = Modifier.padding(horizontal = 40.dp)
        ) {
            OnboardImageComponent(onboardItem.image)
        }
        Spacer(modifier = Modifier.height(32.dp))
        Box(
            modifier = Modifier.padding(horizontal = 24.dp)
        ) {
            OnboardTitleComponent(onboardItem.title)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier.padding(horizontal = 24.dp)
        ) {
            OnboardDescriptionComponent(onboardItem.description)
        }
        Spacer(modifier = Modifier.height(64.dp))
    }
}