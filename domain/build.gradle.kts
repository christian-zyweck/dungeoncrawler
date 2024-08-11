plugins {
    kotlin("jvm") version libs.versions.kotlin.language
}

group = "de.zyweck.dungeoncrawler"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    testImplementation(libs.bundles.test)
}

repositories {
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
}
