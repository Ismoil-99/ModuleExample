plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id(Dependencies.Hilt.plugin)
}

android {
    namespace = "com.example.presentation"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        minSdk = AndroidConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        allWarningsAsErrors = true
    }
    buildFeatures{
        viewBinding = true
    }

}

dependencies {

    implementation(project(":domain"))

    //Core
    implementation(Dependencies.Core.core)

    //Ui
    implementation(Dependencies.UiComponent.material)
    implementation(Dependencies.Activity.activity)

    //Di
    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.compiler)

}