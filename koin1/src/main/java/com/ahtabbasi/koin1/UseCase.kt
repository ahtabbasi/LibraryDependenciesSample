package com.ahtabbasi.koin1

import org.koin.core.Koin
import org.koin.core.component.KoinScopeComponent
import org.koin.core.component.createScope
import org.koin.core.component.inject
import org.koin.core.scope.Scope
import org.koin.dsl.koinApplication

class UseCase : KoinScopeComponent {

    private val repository: Repository by inject()

    private val myKoin: Koin by lazy {
        koinApplication {
            modules(libraryModule)
        }.koin
    }
    override val scope: Scope by lazy { createScope(this) }
    override fun getKoin() = myKoin


    fun getStatus(): String {
        val status = repository.getStatus()
        clearKoinDependencies()
        return status
    }

}