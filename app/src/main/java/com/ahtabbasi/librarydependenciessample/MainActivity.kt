package com.ahtabbasi.librarydependenciessample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ahtabbasi.koin1.UseCase
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val useCase: KoinSetupUseCase by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(TAG, useCase.getStatus())
        Log.v(TAG, UseCase().getStatus())
    }

    companion object {
        private const val TAG = "LibDepMainActivity"
    }
}