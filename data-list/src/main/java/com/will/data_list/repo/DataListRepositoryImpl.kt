package com.will.data_list.repo

import com.will.core.model.ResultWrapper
import com.will.data_list.api.RemoteListApi

internal class DataListRepositoryImpl(private val api: RemoteListApi) : DataListRepository {

    override suspend fun getListByCategory(category: String): ResultWrapper<Any> =
        api.getListByCategory(category).toResult()

}
