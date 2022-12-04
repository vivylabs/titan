package com.vivylabs.titan.module

import com.vivylabs.titan.ui.view.model.NotificationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val notificationViewModelModule = module {
    viewModel { NotificationViewModel() }
}