package com.will.core.di

import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val coreModule = module {
    loadKoinModules(listOf(httpModule, converterModule, retrofitModule))
}