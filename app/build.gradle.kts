import config.Config
import config.Dependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("$rootDir/buildSrc/app_base_application.kts")
}

dependencies {

    implementation(Dependencies.Android.ANDROIDX_CORE)
    implementation(Dependencies.Android.ANDROIDX_APP_COMPAT)
    implementation(Dependencies.Android.ANDROID_MATERIAL)
    implementation(project(mapOf("path" to Dependencies.Modules.DESIGN_SYSTEM)))
    implementation(project(mapOf("path" to Dependencies.Modules.DATA_LIST)))
    implementation(project(mapOf("path" to Dependencies.Modules.CORE)))
    implementation(project(mapOf("path" to Dependencies.Modules.COMMONS)))
}