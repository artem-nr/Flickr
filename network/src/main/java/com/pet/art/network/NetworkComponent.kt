package com.pet.art.network

import android.app.Application
import com.pet.art.core.di.GsonBuilderProvider
import com.pet.art.core.di.GsonProvider
import com.pet.art.core.di.NetworkProvider
import dagger.BindsInstance
import dagger.Component

@Component(
    dependencies = [
        GsonProvider::class,
        GsonBuilderProvider::class,
        NetworkProvider::class
    ],
    modules = [
        GsonBuilderModule::class,
        RetrofitModule::class,
        OkHttpModule::class,
        HttpUrlModule::class
    ]
)
interface NetworkComponent : NetworkProvider {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun networkProvider(networkProvider: NetworkProvider): Builder

        fun gsonProvider(gsonProvider: GsonProvider): Builder

        fun gsonBuilderProvider(gsonBuilderProvider: GsonBuilderProvider): Builder

        fun build(): NetworkComponent
    }
}