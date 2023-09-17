package com.will.data_list.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.will.commons.extensions.viewBinding
import com.will.data_list.R
import com.will.data_list.databinding.FragmentDataListBinding
import com.will.data_list.viewmodel.DataListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

internal class DataListFragment : Fragment(R.layout.fragment_data_list) {

    private val binding: FragmentDataListBinding by viewBinding()
    private val viewModel: DataListViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObservers()
        viewModel.requestCategoryList("creatures")
    }

    private fun setupObservers() {
        viewModel.listLiveData.observe(viewLifecycleOwner) {
            Log.i("Testing", it.toString())
        }
    }

}