package com.will.data_list.domain

import com.will.core.model.ResultWrapper
import com.will.data_list.repo.DataListRepository

internal class DataListUseCaseImpl(private val dataListRepository: DataListRepository) :
    DataListUseCase {

    override suspend fun getListByCategory(category: String): ResultWrapper<Any> =
        dataListRepository.getListByCategory(category)
}
