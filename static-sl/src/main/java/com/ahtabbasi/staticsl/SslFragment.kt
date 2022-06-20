package com.ahtabbasi.staticsl

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SslFragment : Fragment() {

    private val sl: FragmentSL by lazy {
        SL.load()
    }
    private val useCase = sl.factorySslUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG, useCase.getStatus())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ssl, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        SL.unload()
    }

    companion object {
        private const val TAG = "LibDepSslFragment"
    }
}