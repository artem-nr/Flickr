package com.pet.art.network

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val TIMEOUT_CONNECTION_SECONDS = 15L

@Module
class OkHttpModule {

    @Provides
    @Singleton
    fun provideOkHttpBuilder(builder: OkHttpClient.Builder): OkHttpClient {
        return builder
            .connectTimeout(TIMEOUT_CONNECTION_SECONDS, TimeUnit.SECONDS)
            .build()
    }
}