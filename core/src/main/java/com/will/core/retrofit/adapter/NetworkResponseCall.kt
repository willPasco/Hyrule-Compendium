package com.will.core.retrofit.adapter

import com.will.core.model.NetworkResponse
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class NetworkResponseCall<R>(private val call: Call<R>) : Call<NetworkResponse<R>> {

    override fun execute(): Response<NetworkResponse<R>> {
        val response = call.execute()
        val body = response.body()
        return when {
            response.isSuccessful && body != null -> {
                Response.success(NetworkResponse.Success(body))
            }

            response.isSuccessful && body == null -> {
                Response.success(NetworkResponse.Empty())
            }

            else -> {
                Response.success(NetworkResponse.Error(response.errorBody().toString()))
            }
        }
    }

    override fun enqueue(callback: Callback<NetworkResponse<R>>) {
        call.enqueue(object : Callback<R> {
            override fun onResponse(call: Call<R>, response: Response<R>) {
                val body = response.body()
                val result: NetworkResponse<R> = when {
                    response.isSuccessful && body != null -> {
                        NetworkResponse.Success(body)
                    }

                    response.isSuccessful && body == null -> {
                        NetworkResponse.Empty()
                    }

                    else -> {
                        NetworkResponse.Error(response.errorBody().toString())
                    }
                }
                callback.onResponse(this@NetworkResponseCall, Response.success(result))
            }

            override fun onFailure(call: Call<R>, t: Throwable) {
                callback.onResponse(
                    this@NetworkResponseCall,
                    Response.success(NetworkResponse.Error(t.message ?: ""))
                )
            }
        })
    }

    override fun clone(): Call<NetworkResponse<R>> = NetworkResponseCall(call.clone())

    override fun cancel() = call.cancel()

    override fun isExecuted(): Boolean = call.isExecuted

    override fun isCanceled(): Boolean = call.isCanceled

    override fun request(): Request = call.request()

    override fun timeout(): Timeout = call.timeout()

}