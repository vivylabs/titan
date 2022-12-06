package com.vivylabs.titan.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vivylabs.titan.ui.data.OnboardItem

@Composable
fun OnboardComponent(onboardModel: OnboardItem) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Box(
            modifier = Modifier.padding(horizontal = 32.dp)
        ) {
            OnboardImageComponent(onboardModel.image)
        }
        Spacer(modifier = Modifier.height(32.dp))
        OnboardTitleComponent(onboardModel.title)
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            OnboardDescriptionComponent(onboardModel.description)
        }
        Spacer(modifier = Modifier.height(40.dp))
    }
}