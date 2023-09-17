apply {
    from("$rootDir/buildSrc/app_default_config.kts")
    from("$rootDir/buildSrc/build_compile_options.kts")
    from("$rootDir/buildSrc/compile_options.kts")
    from("$rootDir/buildSrc/kotlin_options.kts")
    from("$rootDir/buildSrc/dependencies_instrumented_tests.kts")
    from("$rootDir/buildSrc/dependencies_unit_tests.kts")
}
