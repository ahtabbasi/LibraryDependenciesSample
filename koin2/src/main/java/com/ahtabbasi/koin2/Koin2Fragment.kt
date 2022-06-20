package com.ahtabbasi.koin2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.koin.android.ext.koin.androidContext
import org.koin.core.Koin
import org.koin.core.component.KoinScopeComponent
import org.koin.core.component.createScope
import org.koin.core.component.inject
import org.koin.core.scope.Scope
import org.koin.dsl.koinApplication

class Koin2Fragment : Fragment(), KoinScopeComponent {

    private val myKoin: Koin by lazy {
        koinApplication {
            androidContext(requireContext())
            modules(libraryModule)
        }.koin
    }

    override fun getKoin() = myKoin
    override val scope: Scope by lazy { createScope(this) }

    private val useCase: UseCase by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG, useCase.getStatus())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_koin2, container, false)
    }

    companion object {
        private const val TAG = "LibDepKoin2Fragment"
    }
}