plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("$rootDir/buildSrc/module_base_application.kts")
}

android {
    namespace = "com.will.data_list"
}

dependencies {
    implementation(config.Dependencies.Android.ANDROIDX_CORE)
    implementation(config.Dependencies.Android.ANDROIDX_APP_COMPAT)
    implementation(config.Dependencies.Android.ANDROID_MATERIAL)
    implementation(project(mapOf("path" to config.Dependencies.Modules.DESIGN_SYSTEM)))
    implementation(project(mapOf("path" to config.Dependencies.Modules.CORE)))
    implementation(project(mapOf("path" to config.Dependencies.Modules.COMMONS)))
}