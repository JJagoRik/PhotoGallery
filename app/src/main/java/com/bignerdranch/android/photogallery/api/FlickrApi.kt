package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "fb4e7fa48fa5b41ed6742d0841a4678b"

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=$API_KEY" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}