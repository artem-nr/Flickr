package com.pet.art.network

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides

@Module
class GsonBuilderModule {

    @Provides
    fun provideGsonBuilder(): GsonBuilder {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation()
    }
}