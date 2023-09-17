package com.will.hyrulecompendium

import android.app.Application
import com.will.hyrulecompendium.di.hyruleModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class HyruleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoinApp()
    }

    private fun startKoinApp() {
        startKoin {
            androidContext(this@HyruleApplication)
            androidLogger()
            loadKoinModules(hyruleModule)
        }
    }
}