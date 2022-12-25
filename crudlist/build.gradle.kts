//import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 23
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
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
}

dependencies {

    val room = "2.4.2"
    val compose = "1.3.2"
    val hilt = "2.42"

    implementation(project(":central"))

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    implementation ("androidx.compose.ui:ui:$compose")
    implementation ("androidx.compose.material:material:1.3.1")


    implementation ("androidx.compose.ui:ui-tooling-preview:$compose")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("androidx.activity:activity-compose:1.3.1")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:$compose")
    debugImplementation ("androidx.compose.ui:ui-tooling:$compose")


    //hilt
    implementation ("com.google.dagger:hilt-android:$hilt")
    kapt ("com.google.dagger:hilt-compiler:$hilt")

    // For instrumentation tests
    androidTestImplementation  ("com.google.dagger:hilt-android-testing:$hilt")
    kaptAndroidTest ("com.google.dagger:hilt-compiler:$hilt")

    // For local unit tests
    testImplementation ("com.google.dagger:hilt-android-testing:$hilt")
    kaptTest ("com.google.dagger:hilt-compiler:$hilt")


    // For instrumentation tests
    androidTestImplementation  ("com.google.dagger:hilt-android-testing:$hilt")


    // For local unit tests
    testImplementation ("com.google.dagger:hilt-android-testing:$hilt")


    // Room for data persistence
    api ("androidx.room:room-runtime:$room")

    kapt ("androidx.room:room-compiler:$room")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:$room")

    // optional - Test helpers
    testImplementation ("androidx.room:room-testing:$room")


    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")


}