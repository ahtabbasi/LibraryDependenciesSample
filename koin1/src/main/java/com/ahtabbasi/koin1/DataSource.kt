package com.ahtabbasi.koin1

import kotlin.random.Random

internal class DataSource {

    private val random = Random.nextInt()

    fun getStatus() = "Koin 1 has been setup $random"
}