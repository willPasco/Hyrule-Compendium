apply {
    from("$rootDir/buildSrc/app_default_config.kts")
    from("$rootDir/buildSrc/build_types.kts")
    from("$rootDir/buildSrc/compile_options.kts")
    from("$rootDir/buildSrc/kotlin_options.kts")
    from("$rootDir/buildSrc/dependencies_instrumented_tests.kts")
    from("$rootDir/buildSrc/dependencies_unit_tests.kts")
}

android {
    viewBinding {
        enabled = true
    }
    viewBinding {
        enabled = true
    }
    dataBinding {
        enabled = true
    }
}