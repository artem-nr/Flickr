package com.pet.art.flickrapp.di

import android.app.Application
import com.pet.art.core.di.GsonBuilderProvider
import com.pet.art.core.di.GsonProvider
import com.pet.art.core.di.NetworkProvider
import com.pet.art.flickrapp.FlickrApp
import com.pet.art.network.GsonBuilderComponent
import com.pet.art.network.GsonBuilderModule
import com.pet.art.network.GsonComponent
import com.pet.art.network.GsonModule
import com.pet.art.network.HttpUrlModule
import com.pet.art.network.NetworkComponent
import com.pet.art.network.OkHttpModule
import com.pet.art.network.RetrofitModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(
//    dependencies = [
//        GsonProvider::class,
//        GsonBuilderProvider::class,
//        NetworkProvider::class
//    ],
//    modules = [
//        GsonBuilderModule::class,
//    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        // todo provide di
//        fun gsonBuilderProvider(gsonBuilderProvider: GsonBuilderModule)
//
//        fun networkProvider(networkProvider: NetworkComponent)
//
//        fun gsonProvider(gsonProvider: GsonModule): Builder
//
////        fun networkComponent(networkComponent: NetworkComponent): Builder
////
////        fun gsonComponent(gsonComponent: GsonComponent): Builder
////
////        fun gsonBuilderComponent(gsonBuilderComponent: GsonBuilderComponent): Builder

        fun build(): AppComponent
    }

    fun inject(app: FlickrApp)
}
