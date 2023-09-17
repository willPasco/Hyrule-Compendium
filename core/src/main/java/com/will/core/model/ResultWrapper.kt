package com.will.core.model

sealed class ResultWrapper<out O> {

    data class Success<out O>(val value: O) : ResultWrapper<O>()
    data class Error(val message: String) : ResultWrapper<Nothing>()

    fun <M> map(mapper: (originalData: O) -> M): ResultWrapper<M> = when(this){
        is Success -> Success(mapper(value))
        is Error -> Error(message)
    }

    fun isSuccess() = this is Success
    fun isError() = this is Error

    fun getData(): O = (this as Success).value
    fun getError() = (this as Error).message

    fun onSuccess(action: (value: O) -> Unit) : ResultWrapper<O>{
        if(isSuccess()){
            action(getData())
        }
        return this
    }

    fun onError(action: (value: String) -> Unit): ResultWrapper<O> {
        if(isError()){
            action(getError())
        }
        return this
    }
}