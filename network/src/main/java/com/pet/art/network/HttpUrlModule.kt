package com.pet.art.network

import com.pet.art.core.FlickrRestApi
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrl

private const val FLICKR_API_URL = "https://api.flickr.com/"

@Module
class HttpUrlModule {

    @Provides
    @FlickrRestApi
    fun provideFlickrApiUrl(): HttpUrl {
        return FLICKR_API_URL.toHttpUrl()
    }
}