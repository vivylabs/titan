package com.vivylabs.titan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vivylabs.titan.module.*
import com.vivylabs.titan.ui.view.screen.MainScreen
import com.vivylabs.titan.ui.theme.TitanTheme
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TitanTheme {
                MainScreen()
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