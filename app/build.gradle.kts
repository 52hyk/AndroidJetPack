plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.hyk.androidjetpack"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.hyk.androidjetpack"
        minSdk = 22
        targetSdk = 33
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
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildFeatures {
        //这2个为非必选，想用哪个就保留那个 用的话一定要加上项目中的 ViewBinding & DataBinding 混淆规则
        dataBinding = true
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.appcompat:appcompat:1.6.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //lifecycle
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0")
    implementation ("androidx.lifecycle:lifecycle-common-java8:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    // viewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0")
    implementation ("androidx.fragment:fragment-ktx:1.3.1")
    // liveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")
    implementation ("com.kunminx.archi:unpeek-livedata:4.5.0-beta1")
    //implementation ("com.kunminx.arch:unpeek-livedata:7.8.0")

    //navigation
    implementation ("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.3.5")
    //Gson
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

}