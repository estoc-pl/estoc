pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("multiplatform") version kotlinVersion apply false
    }

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "estoc"
include("BNF")
include("forge")
include("forge-parser-kit")
include("forge-grammar-kit")