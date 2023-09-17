package com.will.core.model

@Suppress("UNCHECKED_CAST")
sealed interface NetworkResponse<out O> {

    class Success<O>(val value: O) : NetworkResponse<O>
    class Empty : NetworkResponse<Nothing>
    class Error(val error: String) : NetworkResponse<Nothing>

    fun toResult(): ResultWrapper<O> =
        when (this) {
            is Success -> ResultWrapper.Success(this.value)
            is Empty -> try {
                ResultWrapper.Success(Unit as O)
            } catch (e: Exception) {
                ResultWrapper.Error("No data content")
            }
            is Error -> ResultWrapper.Error(error)
        }

}