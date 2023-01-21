package com.pet.art.core.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.converter.gson.GsonConverterFactory

interface GsonProvider {

    fun provideGson(): Gson

    fun provideGsonBuilder(): GsonBuilder

    fun provideGsonConverterFactory(): GsonConverterFactory
}