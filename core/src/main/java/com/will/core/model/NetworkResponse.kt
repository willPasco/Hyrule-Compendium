package com.will.core.model

sealed interface NetworkResponse<out O> {

    class Success<O>(val value: O) : NetworkResponse<O>
    class Empty : NetworkResponse<Nothing>
    class Error(val error: String) : NetworkResponse<Nothing>
}
