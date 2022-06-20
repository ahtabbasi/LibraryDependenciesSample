package com.ahtabbasi.koin1

internal class Repository(private val dataSource: DataSource) {

    fun getStatus() = dataSource.getStatus()
}