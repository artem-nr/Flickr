package com.pet.art.network

import com.pet.art.core.FlickrRestApi
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(
    includes = [
        GsonBuilderModule::class
    ]
)
class RetrofitModule {

    @Provides
    @Singleton
    @FlickrRestApi
    internal fun provideRetrofit(
        gsonConverterFactory: GsonConverterFactory,
        builder: Retrofit.Builder,
        okHttpClient: OkHttpClient,
        @FlickrRestApi url: HttpUrl
    ): Retrofit {
        return builder
            .addConverterFactory(gsonConverterFactory)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .baseUrl(url)
            .build()
    }
}