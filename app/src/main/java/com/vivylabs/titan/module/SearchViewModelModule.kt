package com.vivylabs.titan.module

import com.vivylabs.titan.ui.view.model.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val searchViewModelModule = module {
    viewModel { SearchViewModel() }
}