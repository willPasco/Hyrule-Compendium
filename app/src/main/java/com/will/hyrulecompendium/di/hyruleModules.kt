package com.will.hyrulecompendium.di

import com.will.core.di.coreModule
import com.will.data_list.di.dataListModule
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val hyruleModule = module {
    loadKoinModules(listOf(coreModule, dataListModule))
}