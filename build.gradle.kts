plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    
    id("com.google.devtools.ksp").version("2.0.0-1.0.22").apply(false)
    id("com.rickclephas.kmp.nativecoroutines").version("1.0.0-ALPHA-31").apply(false)
}
