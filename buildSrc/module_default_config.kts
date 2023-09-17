import config.Config
import config.Versions.AndroidConfig

android {
    defaultConfig {
        minSdk = AndroidConfig.MIN_SDK

        testInstrumentationRunner = Config.TEST_INSTRUMENTATION_RUNNER
        consumerProguardFiles(Config.PROGUARD_RULES_FILE)
    }
}
