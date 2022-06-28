package com.ahtabbasi.koin1

import org.koin.core.Koin
import org.koin.core.component.KoinComponent
import org.koin.core.component.KoinScopeComponent
import org.koin.core.module.Module
import org.koin.dsl.koinApplication

internal class CustomKoinComponent(vararg module: Module) : KoinComponent {

    private val myKoin: Koin by lazy {
        koinApplication {
            modules(module.toList())
        }.koin
    }

    override fun getKoin() = myKoin
}

internal fun KoinScopeComponent.clearKoinDependencies() {
    scope.close()
}