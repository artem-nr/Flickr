package com.pet.art.network

import com.pet.art.core.di.GsonBuilderProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [GsonBuilderModule::class]
)
interface GsonBuilderComponent : GsonBuilderProvider {

    companion object {

        fun create(): GsonBuilderProvider {
            return DaggerGsonBuilderComponent.builder()
                .build()
        }
    }
}