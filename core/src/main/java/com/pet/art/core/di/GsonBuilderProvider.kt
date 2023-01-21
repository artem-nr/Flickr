package com.pet.art.core.di

import com.google.gson.GsonBuilder

interface GsonBuilderProvider {

    fun provideGsonBuilder(): GsonBuilder
}