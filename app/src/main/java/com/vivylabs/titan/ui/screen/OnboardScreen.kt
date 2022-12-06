package com.vivylabs.titan.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.vivylabs.titan.R
import com.vivylabs.titan.ui.component.OnboardButtonComponent
import com.vivylabs.titan.ui.component.OnboardComponent
import com.vivylabs.titan.ui.component.OnboardOutlinedButtonComponent
import com.vivylabs.titan.ui.component.OnboardSkipComponent
import com.vivylabs.titan.ui.data.onboardItemList

@ExperimentalPagerApi
@Composable
fun OnboardScreen() {
    val pagerState = rememberPagerState()
    Column {
        HorizontalPager(
            count = 3,
            state = pagerState,
            modifier = Modifier.fillMaxWidth()
        ) {
            OnboardComponent(onboardItemList[it])
        }
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            activeColor = Color.Black
        )
        Spacer(modifier = Modifier.height(28.dp))
        AnimatedVisibility(visible = pagerState.currentPage == 0 || pagerState.currentPage == 1) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                OnboardButtonComponent(buttonText = R.string.onboard_next_button)
                Spacer(modifier = Modifier.height(16.dp))
                OnboardSkipComponent()
            }
        }
        AnimatedVisibility(visible = pagerState.currentPage == 2) {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                OnboardButtonComponent(buttonText = R.string.onboard_signup_button)
                Spacer(modifier = Modifier.height(16.dp))
                OnboardOutlinedButtonComponent(buttonText = R.string.onboard_login_button)
            }
        }
    }
}