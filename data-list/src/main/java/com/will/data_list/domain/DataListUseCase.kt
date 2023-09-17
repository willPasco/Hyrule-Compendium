package com.will.data_list.domain

import com.will.core.model.ResultWrapper

internal interface DataListUseCase {

    suspend fun getListByCategory(category: String): ResultWrapper<Any>
}
