package com.ahtabbasi.koin2

internal class UseCase(private val repository: Repository) {

    fun getStatus() = repository.getStatus()

}