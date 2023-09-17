package com.will.data_list.repo

import com.will.core.model.ResultWrapper

internal interface DataListRepository {
    suspend fun getListByCategory(category: String): ResultWrapper<Any>
}
