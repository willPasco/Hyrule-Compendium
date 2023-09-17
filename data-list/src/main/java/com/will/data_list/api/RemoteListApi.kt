package com.will.data_list.api

import com.will.core.model.NetworkResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface RemoteListApi {

    @GET("api/v3/compendium/category/{category}")
    suspend fun getListByCategory(@Path("category") category: String): NetworkResponse<Any>

}
