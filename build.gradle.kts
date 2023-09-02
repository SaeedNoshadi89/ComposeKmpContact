plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.compose).apply(false)
    kotlin(libs.plugins.android.get().pluginId).version(libs.versions.kotlin).apply(false)
    kotlin(libs.plugins.multiplatform.get().pluginId).version(libs.versions.kotlin).apply(false)
}
