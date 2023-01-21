package com.pet.art.core.di

import com.pet.art.core.FlickrRestApi
import retrofit2.Retrofit

interface NetworkProvider {

    fun provideRetrofitBuilder(): Retrofit.Builder

    @FlickrRestApi fun provideFlickrRetrofitBuilder(): Retrofit.Builder
}