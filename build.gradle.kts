plugins {
    java
    kotlin("jvm") version "1.6.21"
}

group = "org.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    testCompile("junit", "junit", "4.12")
}
