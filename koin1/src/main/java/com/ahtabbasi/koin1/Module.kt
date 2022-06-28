package com.ahtabbasi.koin1

import org.koin.dsl.module

internal val libraryModule = module {
    scope<UseCase> {
        scoped { DataSource() }
        factory { Repository(get()) }
    }
}