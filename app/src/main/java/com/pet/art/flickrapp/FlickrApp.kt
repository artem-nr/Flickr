package com.pet.art.flickrapp

import android.app.Application
import com.pet.art.flickrapp.di.AppComponent
import com.pet.art.flickrapp.di.DaggerAppComponent

class FlickrApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}