import config.Config
import config.Versions.AndroidConfig

android {
    namespace = Config.APP_NAMESPACE
    compileSdk = AndroidConfig.COMPILE_SDK

    defaultConfig {
        applicationId = Config.APP_NAMESPACE
        minSdk = AndroidConfig.MIN_SDK
        targetSdk = AndroidConfig.TARGET_SDK
        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME

        testInstrumentationRunner = Config.TEST_INSTRUMENTATION_RUNNER
    }
}
