package com.vivylabs.titan.provide

import com.vivylabs.titan.interceptor.AuthInterceptor
import okhttp3.OkHttpClient

fun provideOkHttpClient(authInterceptor: AuthInterceptor): OkHttpClient {
    return OkHttpClient().newBuilder().addInterceptor(authInterceptor).build()
}