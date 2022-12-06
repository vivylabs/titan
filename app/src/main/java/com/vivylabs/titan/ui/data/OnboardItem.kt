package com.vivylabs.titan.ui.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class OnboardItem(
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
