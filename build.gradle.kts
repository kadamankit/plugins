// Top-level build file where you can add configuration options common to all sub-projects/modules.



buildscript {
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.9.0"))
    }
}
plugins {
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    kotlin("jvm") version "1.9.0" apply false

}