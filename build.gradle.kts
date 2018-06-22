import org.jetbrains.kotlin.gradle.dsl.Coroutines
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

buildscript {
    repositories {
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${properties["kotlin_version"]}")
    }
}

allprojects {
    group = "solution.bike"
    version = "1.0-SNAPSHOT"
    repositories {
        jcenter()
        mavenCentral()
    }
    plugins.withType<KotlinPluginWrapper> {
        configure<KotlinProjectExtension> {
            experimental.coroutines = Coroutines.ENABLE
        }

        tasks.withType<KotlinJvmCompile> {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
}
