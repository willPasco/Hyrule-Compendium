package com.will.commons.extensions

import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.will.commons.delegate.FragmentViewBindingDelegate

inline fun <reified V : ViewBinding> Fragment.viewBinding() =
    FragmentViewBindingDelegate(V::class.java, this)