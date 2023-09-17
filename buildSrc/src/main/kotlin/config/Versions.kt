package config

sealed interface Versions {

    object AndroidConfig : Versions {
        const val MIN_SDK = 26
        const val COMPILE_SDK = 33
        const val TARGET_SDK = COMPILE_SDK
        const val VERSION_CODE = 1
        const val VERSION_NAME = 1.0
        const val JVM_TARGET = "1.8"
    }

    object Libs: Versions {
        const val ANDROIDX_APP_COMPAT = "1.6.1"
        const val JUNIT = "4.13.2"
        const val ANDROIDX_JUNIT = "1.1.5"
        const val ESPRESSO_CORE = "3.5.1"
        const val ANDROIDX_CORE = "1.9.0"
        const val ANDROID_MATERIAL = "1.8.0"
        const val KOIN_ANDROID = "3.1.3"
        const val VIEW_MODEL = "2.5.1"
        const val RETROFIT = "2.9.0"
        const val OKHTTP_LOGGING_INTERCEPTOR = "4.8.1"
        const val MOSHI = "1.12.0"
        const val NAVIGATION = "2.5.3"
    }
}