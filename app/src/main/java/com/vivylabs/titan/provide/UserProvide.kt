package com.vivylabs.titan.provide

import com.vivylabs.titan.service.UserService
import retrofit2.Retrofit

fun provideUser(retrofit: Retrofit): UserService = retrofit.create(UserService::class.java)