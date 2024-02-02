plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id(Dependencies.Hilt.plugin)
}

android {
    namespace = "com.example.moduleexample"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.moduleexample"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packaging{
        resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
    }

}

dependencies {

    implementation(project(":presentation"))
    implementation(project(":domain"))
    implementation(project(":data"))

    //Core
    implementation(Dependencies.Core.core)

    //Ui
    implementation(Dependencies.UiComponent.material)
    implementation(Dependencies.UiComponent.constraintLayout)

    //Di
    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.compiler)

    //Network
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.converterGson)














}