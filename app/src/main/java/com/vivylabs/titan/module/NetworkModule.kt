package com.vivylabs.titan.module

import com.vivylabs.titan.interceptor.AuthInterceptor
import com.vivylabs.titan.provide.provideOkHttpClient
import com.vivylabs.titan.provide.provideRetrofit
import com.vivylabs.titan.provide.provideUser
import org.koin.dsl.module

val networkModule = module {
    single { AuthInterceptor(get()) }
    single { provideOkHttpClient(get()) }
    single { provideRetrofit(get()) }
    single { provideUser(get()) }
}