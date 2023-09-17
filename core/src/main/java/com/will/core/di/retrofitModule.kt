package com.will.core.di

import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val BASE_URL = "https://botw-compendium.herokuapp.com/"

val retrofitModule = module {

    factory<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(get<MoshiConverterFactory>())
            .client(get())
            .build()
    }
}