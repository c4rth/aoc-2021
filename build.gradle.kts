plugins {
    kotlin("jvm") version "1.6.10"
}

repositories {
    mavenCentral()
}

tasks {
    wrapper {
        gradleVersion = "7.3"
    }
}
dependencies {
    implementation("org.jetbrains.kotlinx:multik-api:0.1.1")
    implementation("org.jetbrains.kotlinx:multik-default:0.1.1")
    testImplementation(platform("org.junit:junit-bom:5.8.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}