package com.ahtabbasi.koin1

import org.koin.core.component.inject

class UseCase {

    private val di = CustomKoinComponent()

    private val repository: Repository by di.inject()

    fun getStatus() = repository.getStatus()

}