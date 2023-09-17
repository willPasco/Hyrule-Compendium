package com.will.data_list.di

import com.will.data_list.api.RemoteListApi
import com.will.data_list.domain.DataListUseCase
import com.will.data_list.domain.DataListUseCaseImpl
import com.will.data_list.repo.DataListRepository
import com.will.data_list.repo.DataListRepositoryImpl
import com.will.data_list.viewmodel.DataListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val dataListModule = module {

    viewModel { DataListViewModel(get()) }
    factory<DataListRepository> { DataListRepositoryImpl(get()) }
    factory<DataListUseCase> { DataListUseCaseImpl(get()) }
    factory<RemoteListApi> { get<Retrofit>().create(RemoteListApi::class.java) }
}