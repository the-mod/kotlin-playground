plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "org.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1")
    testCompile("junit", "junit", "4.12")
}
