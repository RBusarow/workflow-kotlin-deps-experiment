buildscript {
  dependencies {
    classpath(libs.android.gradle.plugin)
    classpath(libs.kotlinx.benchmark.gradle.plugin)
    classpath(libs.dokka.gradle.plugin)
    classpath(libs.kotlin.serialization.gradle.plugin)
    classpath(libs.kotlinx.binaryCompatibility.gradle.plugin)
    classpath(libs.kotlin.gradle.plugin)
    classpath(libs.google.ksp)
    classpath(libs.vanniktech.publish)
  }
}

plugins {
  base
  kotlin("jvm") version "1.7.20"
}
