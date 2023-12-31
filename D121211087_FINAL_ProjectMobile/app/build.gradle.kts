
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("org.jetbrains.kotlin.plugin.serialization") version "1.7.20"
}

android {
    namespace = "com.D121211048.mybook"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.D121211048.mybook"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation ("androidx.activity:activity-compose:1.6.1")
    implementation ("androidx.compose.ui:ui:1.3.3")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.3.3")
    //implementation 'androidx.compose.material:material:1.3.1'
    //implementation 'com.google.android.material:material:1.7.0'
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.3.3")
    debugImplementation ("androidx.compose.ui:ui-tooling:1.3.3")
    debugImplementation ("androidx.compose.ui:ui-test-manifest:1.3.3")

    implementation ("androidx.compose.material3:material3:1.1.0-alpha04")


    // viewmodel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1")
    // retrofit
    implementation ("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    // json file
    //implementation "org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    // images in json
    implementation ("io.coil-kt:coil-compose:2.2.2")

    //Navigation
    implementation ("androidx.navigation:navigation-compose:2.5.3")

    implementation ("androidx.compose.material:material-icons-extended:1.3.1")
}