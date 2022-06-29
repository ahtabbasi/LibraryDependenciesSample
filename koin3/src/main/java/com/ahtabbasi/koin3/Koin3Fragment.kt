package com.ahtabbasi.koin3

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.ahtabbasi.koin3.R
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.parameter.parametersOf

class Koin3Fragment : Fragment(), KoinComponent by CustomKoinComponent(libraryModule) {

    private val viewModel by lazy {
        getViewModel<Koin3ViewModel> { parametersOf("param from fragment") }
    }

    private val useCase: UseCase by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_koin3, container, false)
    }

    override fun onResume() {
        super.onResume()

        val status = useCase.getStatus()
        val hello = viewModel.getHello()

        Log.v(TAG, status)
        Log.v(TAG, hello)

        view?.findViewById<TextView>(R.id.mTextView)?.text = "$status\n$hello"
    }

    companion object {
        private const val TAG = "LibDepKoin3Fragment"
    }
}