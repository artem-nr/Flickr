package com.pet.art.network

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        GsonBuilderModule::class,
        RetrofitModule::class,
        OkHttpModule::class,
        HttpUrlModule::class
    ]
)
interface NetworkComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): NetworkComponent
    }
}