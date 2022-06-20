package com.ahtabbasi.koin1

import org.koin.core.Koin
import org.koin.core.KoinApplication
import org.koin.core.component.KoinComponent
import org.koin.dsl.koinApplication
import org.koin.dsl.module


internal val libraryModule = module {

    single { DataSource() }

    factory { Repository(get()) }

}

internal object MyKoinContext {
    val koinApp: KoinApplication = koinApplication {
        modules(libraryModule)
    }
}

internal class CustomKoinComponent : KoinComponent {
    override fun getKoin(): Koin = MyKoinContext.koinApp.koin
}