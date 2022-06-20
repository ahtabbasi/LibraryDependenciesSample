package com.ahtabbasi.koin2

import org.koin.dsl.module

internal val libraryModule = module {

    single { DataSource() }

    factory { Repository(get()) }

    factory { UseCase(get()) }

}