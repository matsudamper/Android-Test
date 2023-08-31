pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            version("compose_compiler", "1.3.2")

            library("android-core-ktx", "androidx.core:core-ktx:1.9.0")
            library("android-activity-ktx", "androidx.activity:activity-ktx:1.7.2")
            library("android-activity-compose", "androidx.activity:activity-compose:1.7.2")

            val composeUiVersion = "1.5.0"
            library("android-compose-ui", "androidx.compose.ui:ui:$composeUiVersion")
            library("android-compose-ui-graphics", "androidx.compose.ui:ui-graphics:$composeUiVersion")
            library("android-compose-ui-tooling", "androidx.compose.ui:ui-tooling:$composeUiVersion")
            library("android-compose-ui-tooling-preview", "androidx.compose.ui:ui-tooling-preview:$composeUiVersion")
            library("android-compose-ui-test-junit4", "androidx.compose.ui:ui-test-junit4:$composeUiVersion")
            library("android-compose-ui-test-manifest", "androidx.compose.ui:ui-test-manifest:$composeUiVersion")
        }
    }
}
rootProject.name = "Android Test"
include(":app")
