package com.will.data_list.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.will.core.extensions.execute
import com.will.data_list.domain.DataListUseCase

internal class DataListViewModel(private val dataListUseCase: DataListUseCase) : ViewModel() {
    private val _listLiveData = MutableLiveData<Any>()
    val listLiveData: LiveData<Any> = _listLiveData

    fun requestCategoryList(category: String) {
        execute {
            dataListUseCase.getListByCategory(category).onSuccess {value ->
                _listLiveData.postValue(value)
            }.onError { error ->
                Log.e("TESTING", error)
            }
        }
    }

}