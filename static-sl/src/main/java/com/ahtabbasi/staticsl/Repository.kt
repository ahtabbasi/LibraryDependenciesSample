package com.ahtabbasi.staticsl

internal class Repository(sl: RepositorySL) {

    private val dataSource = sl.singletonSslDataSource()

    fun getStatus() = dataSource.getStatus()
}

