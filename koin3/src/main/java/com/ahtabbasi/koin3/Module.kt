package com.ahtabbasi.koin3

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.Koin
import org.koin.core.component.KoinComponent
import org.koin.core.module.Module
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

internal class CustomKoinComponent(vararg module: Module) : KoinComponent {

    private val myKoin: Koin by lazy {
        koinApplication {
            modules(module.toList())
        }.koin
    }

    override fun getKoin() = myKoin
}