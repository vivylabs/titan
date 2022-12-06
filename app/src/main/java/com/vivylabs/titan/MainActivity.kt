package com.vivylabs.titan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.accompanist.pager.ExperimentalPagerApi
import com.vivylabs.titan.module.*
import com.vivylabs.titan.ui.theme.TitanTheme
import com.vivylabs.titan.ui.screen.OnboardScreen
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TitanTheme {
                OnboardScreen()
            }
        }
        startKoin {
            androidLogger()
            androidContext(this@MainActivity)
            modules(
                listOf(
                    networkModule,
                    sharedPreferencesModule,
                    userRepositoryModule,
                    homeViewModelModule,
                    notificationViewModelModule,
                    profileViewModelModule,
                    searchViewModelModule
                )
            )
        }
    }
}