package com.vivylabs.titan.module

import com.vivylabs.titan.repository.UserRepository
import org.koin.dsl.module

val userRepositoryModule = module {
    single { UserRepository(get()) }
}