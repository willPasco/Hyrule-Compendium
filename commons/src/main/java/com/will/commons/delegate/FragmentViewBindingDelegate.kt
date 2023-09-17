package com.will.commons.delegate

import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class FragmentViewBindingDelegate<V : ViewBinding>(
    bindingClass: Class<V>,
    fragment: Fragment
) : ReadOnlyProperty<Fragment, V> {

    private var binding: V? = null
    private var bindingMethod = bindingClass.getMethod("bind", View::class.java)

    init {
        fragment.viewLifecycleOwnerLiveData.observe(fragment) { owner ->
            owner.lifecycle.addObserver(LifecycleEventObserver { _: LifecycleOwner, event: Lifecycle.Event ->
                if (event == Lifecycle.Event.ON_DESTROY) {
                    binding = null
                }
            })
        }
    }

    override fun getValue(thisRef: Fragment, property: KProperty<*>): V =
        binding ?: thisRef.view?.let { view ->
            (bindingMethod.invoke(null, view) as V).also {
                (it as? ViewDataBinding)?.apply {
                    lifecycleOwner = thisRef.viewLifecycleOwner
                }
                binding = it
            }
        }?: throw Exception("Can't access the binding when the view is null.")

}