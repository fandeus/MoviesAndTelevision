buildscript {
    dependencies {
        classpath(libs.gradle)
        classpath(libs.googleServices)
        classpath(libs.crashlyticsGradle)
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.com.android.application) apply false
    alias(libs.plugins.org.jetbrains.kotlin.android) apply false
    alias(libs.plugins.gms.google.services) apply false
    alias(libs.plugins.com.google.firebase.crashlytics) apply false
}