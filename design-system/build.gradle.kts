plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("$rootDir/buildSrc/module_base_application.kts")
}

android {
    namespace = "com.will.design_system"
}

dependencies {

    implementation(config.Dependencies.Android.ANDROIDX_CORE)
    implementation(config.Dependencies.Android.ANDROIDX_APP_COMPAT)
    implementation(config.Dependencies.Android.ANDROID_MATERIAL)
}