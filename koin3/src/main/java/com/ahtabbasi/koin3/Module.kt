package com.ahtabbasi.koin3

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.Koin
import org.koin.core.component.KoinComponent
import org.koin.dsl.koinApplication
import org.koin.dsl.module

internal val libraryModule = module {
    viewModel { params ->
        Koin3ViewModel(
            params.get()
        )
    }
    factory { Repository(get()) }
    factory { UseCase(get()) }
    single { DataSource() }
}

internal interface CustomKoinComponent : KoinComponent {
    override fun getKoin(): Koin = koinApplication {
        modules(libraryModule)
    }.koin
}