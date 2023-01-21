package com.pet.art.network

import com.pet.art.core.di.GsonBuilderProvider
import com.pet.art.core.di.GsonProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [GsonBuilderProvider::class],
    modules = [GsonModule::class]
)
interface GsonComponent : GsonProvider {

    companion object {

        fun create(gsonBuilderProvider: GsonBuilderProvider): GsonProvider {
            return DaggerGsonComponent.builder()
                .gsonBuilderProvider(gsonBuilderProvider)
                .build()
        }
    }
}