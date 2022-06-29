package com.ahtabbasi.koin3

internal class UseCase(private val repository: Repository) {

    fun getStatus() = repository.getStatus()

}