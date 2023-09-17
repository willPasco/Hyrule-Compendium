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

    object Modules: Dependencies {
        const val DESIGN_SYSTEM = ":design-system"
    }
}