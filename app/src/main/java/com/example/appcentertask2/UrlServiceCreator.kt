package com.example.appcentertask2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UrlServiceCreator {

    val BASE_URL = "https://openapi.naver.com/v1/util/" // JSON 출력

    fun create() : UrlService { //서버와 통신하기 위한 Service객체를 생성해주는 역할.
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) //GsonConverterFactory를 추가하여 JSON형식을 DTO Class 형식으로 자동변환.
            .build()
            .create(UrlService::class.java)
    }
}