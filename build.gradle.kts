plugins {
    alias(libs.plugins.ktlint)
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
    kotlin("jvm") version libs.versions.kotlin.language
    kotlin("plugin.spring") version libs.versions.kotlin.language
}

group = "de.zyweck.dungeon"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.bundles.spring.dependencies)
    implementation(libs.jackson.module.kotlin)
    implementation(libs.kotlin.reflect)
    implementation(libs.kotlin.logging)

    testImplementation(libs.bundles.test.dependencies)
    testRuntimeOnly(libs.junit.platform.launcher)
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
