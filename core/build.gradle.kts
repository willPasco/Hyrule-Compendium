plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("$rootDir/buildSrc/module_base_application.kts")
}

android {
    namespace = "com.will.core"
}

dependencies {

    implementation(config.Dependencies.Android.ANDROIDX_CORE)
    implementation(config.Dependencies.Android.ANDROIDX_APP_COMPAT)
    implementation(config.Dependencies.OkHttp.LOGGING_INTERCEPTOR)

    api(config.Dependencies.Koin.ANDROID)
    api(config.Dependencies.LifeCycle.VIEW_MODEL)
    api(config.Dependencies.Retrofit.RETROFIT)
    api(config.Dependencies.Retrofit.MOSHI_CONVERTER)
    api(config.Dependencies.Moshi.KOTLIN)
    api(config.Dependencies.Moshi.ADAPTERS)
}