// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

}
plugins {
    id("com.android.application") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.22" apply false
    id("com.android.library") version "8.2.1" apply false
    id(Dependencies.Hilt.plugin) version Dependencies.Hilt.version apply false
}