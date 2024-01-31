plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id ("kotlin-kapt")
}

tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
    targetCompatibility = JavaVersion.VERSION_1_8.toString()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.allWarningsAsErrors = true
}
dependencies {


    //Di
    implementation(Dependencies.Hilt.compiler)
    kapt(Dependencies.Hilt.compiler)
}