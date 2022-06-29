package com.ahtabbasi.koin3

import androidx.lifecycle.ViewModel

class Koin3ViewModel(private val param: String) : ViewModel() {

    fun getHello() = "Hello from ViewModel with $param"
}