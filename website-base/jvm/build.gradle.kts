import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    id("org.jetbrains.kotlin.platform.jvm")
}

dependencies {
    expectedBy(project(":website-base:common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${properties["coroutines_version"]}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-nio:${properties["coroutines_version"]}")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:${properties["kotlinx_html_version"]}")
}

kotlin.experimental.coroutines = Coroutines.ENABLE
