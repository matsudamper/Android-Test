pluginManagement {
    includeBuild("build-logic")
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
            from(files("./build-logic/libs.versions.toml"))
            version("compose_compiler", "1.5.2")

            library("android-core-ktx", "androidx.core:core-ktx:1.10.1")
            library("android-activity-ktx", "androidx.activity:activity-ktx:1.7.2")
            library("android-activity-compose", "androidx.activity:activity-compose:1.7.2")

            val composeUiVersion = "1.5.2"
            library("android-compose-ui", "androidx.compose.ui:ui:$composeUiVersion")
            library("android-compose-ui-graphics", "androidx.compose.ui:ui-graphics:$composeUiVersion")
            library("android-compose-ui-tooling", "androidx.compose.ui:ui-tooling:$composeUiVersion")
            library("android-compose-ui-tooling-preview", "androidx.compose.ui:ui-tooling-preview:$composeUiVersion")
            library("android-compose-ui-test-junit4", "androidx.compose.ui:ui-test-junit4:$composeUiVersion")
            library("android-compose-ui-test-manifest", "androidx.compose.ui:ui-test-manifest:$composeUiVersion")
        }
    }
}
rootProject.name = "AndroidTest"
include(":app")
