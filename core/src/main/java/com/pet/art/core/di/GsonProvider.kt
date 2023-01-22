package com.pet.art.core.di

import com.google.gson.Gson
import retrofit2.converter.gson.GsonConverterFactory

interface GsonProvider {

    fun provideGson(): Gson

    fun provideGsonConverterFactory(): GsonConverterFactory
}