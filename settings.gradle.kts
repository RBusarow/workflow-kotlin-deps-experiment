rootProject.name = "workflow-deps-experiment"

pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
    // For binary compatibility validator.
    maven { url = uri("https://kotlin.bintray.com/kotlinx") }
  }
}

plugins {
  id("com.gradle.enterprise") version "3.8.1"
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
  }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
  repositories {
    mavenCentral()
    google()
    // See androidx.dev (can use this for Snapshot builds of AndroidX)
    // maven { url = java.net.URI.create("https://androidx.dev/snapshots/builds/8224905/artifacts/repository") }
  }
}
