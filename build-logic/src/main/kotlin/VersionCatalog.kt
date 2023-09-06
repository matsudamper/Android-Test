

object VersionCatalog {
    object Android {
        val androidKtx = "androidx.core:core-ktx:1.8.0"

        object Compose {
            private val composeUiVersion = "1.3.3"
            val ui = "androidx.compose.ui:ui:$composeUiVersion"
            val uiGraphics = "androidx.compose.ui:ui-graphics:$composeUiVersion"
            val uiTooling = "androidx.compose.ui:ui-tooling:1.3.3"
            val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:1.3.3"
            val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:1.3.3"
            val uiTestManifest = "androidx.compose.ui:ui-test-manifest:1.5.1"
        }
    }
}
