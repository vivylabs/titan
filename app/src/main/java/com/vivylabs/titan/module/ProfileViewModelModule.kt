package com.vivylabs.titan.module

import com.vivylabs.titan.ui.viewmodel.ProfileViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val profileViewModelModule = module {
    viewModel { ProfileViewModel() }
}