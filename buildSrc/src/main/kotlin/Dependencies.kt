object Dependencies {

    object Kotlin {
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3"
    }

    object UiComponent{
        const val material = "com.google.android.material:material:1.11.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    }

    object Core{
        private const val version = "1.12.0"
        const val core = "androidx.core:core-ktx:$version"
    }

    object Activity {
        private const val version = "1.8.2"
        const val activity = "androidx.activity:activity-ktx:$version"
    }


    object Retrofit {
        private const val version = "2.9.0"

        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val converterGson = "com.squareup.retrofit2:converter-gson:$version"
    }

    object Hilt {
        const val version =  "2.48"

        const val android = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-android-compiler:$version"
        const val plugin = "com.google.dagger.hilt.android"
    }

}