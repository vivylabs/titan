package com.vivylabs.titan.module

import androidx.preference.PreferenceManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val sharedPreferencesModule = module {
    single { PreferenceManager.getDefaultSharedPreferences(androidContext()) }
}