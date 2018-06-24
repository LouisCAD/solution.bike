import org.jetbrains.kotlin.config.AnalysisFlag.Flags.experimental
import org.jetbrains.kotlin.gradle.dsl.*
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    id("org.jetbrains.kotlin.platform.js")
}

dependencies {
    expectedBy(project(":website:common"))

    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-js:${properties["coroutines_version"]}")
    implementation("org.jetbrains.kotlinx:kotlinx-html-js:${properties["kotlinx_html_version"]}")
}

val compileKotlin2Js: Kotlin2JsCompile by tasks

//compileKotlin2Js.kotlinOptions.outputFile = TODO()

tasks.withType<Kotlin2JsCompile> {
    kotlinOptions {
        moduleKind = "umd"
        sourceMap = true
        sourceMapEmbedSources = "always"
    }
}

kotlin.experimental.coroutines = Coroutines.ENABLE
