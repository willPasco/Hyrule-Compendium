import config.Config

android {
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(Config.PROGUARD_OPTIMIZE_FILE),
                Config.PROGUARD_RULES_FILE
            )
        }
    }
}
