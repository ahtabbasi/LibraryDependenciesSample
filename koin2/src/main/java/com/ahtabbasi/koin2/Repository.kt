package com.ahtabbasi.koin2

internal class Repository(private val dataSource: DataSource) {

    fun getStatus() = dataSource.getStatus()
}