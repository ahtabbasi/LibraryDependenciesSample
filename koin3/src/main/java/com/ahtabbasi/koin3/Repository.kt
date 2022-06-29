package com.ahtabbasi.koin3

internal class Repository(private val dataSource: DataSource) {

    fun getStatus() = dataSource.getStatus()
}