package com.ahtabbasi.librarydependenciessample

import org.koin.dsl.module

val appModule = module {

    factory { KoinSetupUseCase() }
}