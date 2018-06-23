import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    id("org.jetbrains.kotlin.platform.common")
}

dependencies {
    implementation(kotlin("stdlib-common"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${properties["coroutines_version"]}")
    implementation("org.jetbrains.kotlinx:kotlinx-html-common:${properties["kotlinx_html_version"]}")

    testImplementation(kotlin("test-annotations-common"))
    testImplementation(kotlin("test-common"))
}

kotlin.experimental.coroutines = Coroutines.ENABLE
