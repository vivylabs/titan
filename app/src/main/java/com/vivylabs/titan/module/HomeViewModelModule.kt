package com.vivylabs.titan.module

import com.vivylabs.titan.ui.view.model.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeViewModelModule = module {
    viewModel { HomeViewModel() }
}