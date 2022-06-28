package com.ahtabbasi.koin2

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val libraryModule = module {
    scope<Koin2Fragment> {
        viewModel { Koin2ViewModel() }
        factory { Repository(get()) }
        factory { UseCase(get()) }
        scoped { DataSource() }
    }
}