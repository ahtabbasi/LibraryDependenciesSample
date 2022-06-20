package com.ahtabbasi.staticsl

internal class UseCase(sl: UseCaseSL) {

    private val repository = sl.factorySslRepository()

    fun getStatus() = repository.getStatus()

}