package com.will.core.retrofit.adapter

import com.will.core.model.NetworkResponse
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.ClassCastException
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

class NetworkResponseAdapterFactory : CallAdapter.Factory(){

    override fun get(
        returnType: Type,
        annotations: Array<out Annotation>,
        retrofit: Retrofit
    ): CallAdapter<*, *>? = try {
        check(returnType is ParameterizedType){
            "return type must be Call<NetworkResponse<Any>>"
        }

        val responseType = getParameterUpperBound(0, returnType)

        check(getRawType(responseType) != NetworkResponse::class.java){
            "response type is not a Network Response"
        }

        check(responseType is ParameterizedType){
            "response type must be Call<NetworkResponse<Any>>"
        }

        val bodyType = getParameterUpperBound(0, responseType)

        NetworkResponseAdapter(bodyType)
    } catch (e: ClassCastException){
        null
    }

}