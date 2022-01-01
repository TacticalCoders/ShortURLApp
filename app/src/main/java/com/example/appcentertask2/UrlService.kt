package com.example.appcentertask2

import retrofit2.Call
import retrofit2.http.*

interface UrlService {
    @FormUrlEncoded
    @POST("shorturl")
    fun requestShortUrl (@Header("X-Naver-Client-Id")clientID: String,
                            @Header("X-Naver-Client-Secret")apiKey: String,
                            @Field("url")originalUrl: String ) : Call<UrlEntity>
}