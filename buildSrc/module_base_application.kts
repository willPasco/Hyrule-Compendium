import config.Versions.AndroidConfig

apply {
    from("$rootDir/buildSrc/module_default_config.kts")
    from("$rootDir/buildSrc/build_types.kts")
    from("$rootDir/buildSrc/compile_options.kts")
    from("$rootDir/buildSrc/kotlin_options.kts")
    from("$rootDir/buildSrc/dependencies_instrumented_tests.kts")
    from("$rootDir/buildSrc/dependencies_unit_tests.kts")
}

android {
    compileSdk = AndroidConfig.COMPILE_SDK
}
