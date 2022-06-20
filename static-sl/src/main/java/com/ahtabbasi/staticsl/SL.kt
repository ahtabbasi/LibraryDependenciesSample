package com.ahtabbasi.staticsl

internal class SL private constructor() : RepositorySL, UseCaseSL, FragmentSL {

    private val dataSource by lazy {
        DataSource()
    }

    override fun singletonSslDataSource() = dataSource

    override fun factorySslRepository() = Repository(this)

    override fun factorySslUseCase() = UseCase(this)

    companion object {

        private var instance: SL? = null

        fun load(): SL {
            if (instance == null) instance = SL()
            return instance!!
        }

        fun unload() {
            instance = null
        }
    }

}


internal interface RepositorySL {
    fun singletonSslDataSource(): DataSource
}

internal interface UseCaseSL {
    fun factorySslRepository(): Repository
}

internal interface FragmentSL {
    fun factorySslUseCase(): UseCase
}