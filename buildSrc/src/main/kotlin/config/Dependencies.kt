package config

sealed interface Dependencies {

    object UnitTest : Dependencies {
        const val JUNIT = "junit:junit:${Versions.Libs.JUNIT}"
    }

    object InstrumentedTest: Dependencies {
        const val ANDROIDX_JUNIT = "androidx.test.ext:junit:${Versions.Libs.ANDROIDX_JUNIT}"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.Libs.ESPRESSO_CORE}"
    }

    object Android: Dependencies {
        const val ANDROIDX_CORE = "androidx.core:core-ktx:${Versions.Libs.ANDROIDX_CORE}"
        const val ANDROIDX_APP_COMPAT = "androidx.appcompat:appcompat:${Versions.Libs.ANDROIDX_APP_COMPAT}"
        const val ANDROID_MATERIAL = "com.google.android.material:material:${Versions.Libs.ANDROID_MATERIAL}"
    }

    object Koin: Dependencies {
        const val ANDROID = "io.insert-koin:koin-android:${Versions.Libs.KOIN_ANDROID}"
    }

    object LifeCycle: Dependencies {
        const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Libs.VIEW_MODEL}"
    }

    object Retrofit: Dependencies {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.Libs.RETROFIT}"
        const val MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:${Versions.Libs.RETROFIT}"
        const val GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.Libs.RETROFIT}"
    }

    object OkHttp: Dependencies {
        const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.Libs.OKHTTP_LOGGING_INTERCEPTOR}"
    }

    object Moshi: Dependencies {
        const val KOTLIN = "com.squareup.moshi:moshi-kotlin:${Versions.Libs.MOSHI}"
        const val ADAPTERS = "com.squareup.moshi:moshi-adapters:${Versions.Libs.MOSHI}"
    }

    object Navigation: Dependencies {
        const val FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.Libs.NAVIGATION}"
        const val UI = "androidx.navigation:navigation-ui-ktx:${Versions.Libs.NAVIGATION}"
        const val DYNAMIC = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.Libs.NAVIGATION}"
    }

    object Modules: Dependencies {
        const val DESIGN_SYSTEM = ":design-system"
        const val DATA_LIST = ":data-list"
        const val CORE = ":core"
        const val COMMONS = ":commons"
    }
}