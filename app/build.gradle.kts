plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.androidJunit5)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId = "info.sanaebadi.junit5"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }


}






dependencies {

    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)

    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.espresso)
//
//    // AndroidX test
//    def androidx_test_version = "1.1.0"
//    androidTestImplementation("androidx.test:core:$androidx_test_version")
//    androidTestImplementation("androidx.test:runner:$androidx_test_version")
//    androidTestImplementation("androidx.test:rules:1.2.0")
//
//
//    // -------- LOCAL UNIT TESTS (use JUnit5)
//    // JUnit Jupiter
//    def junit_jupiter_version = "5.3.2"
//    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit_jupiter_version")
//    testImplementation("org.junit.jupiter:junit-jupiter-params:$junit_jupiter_version")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junit_jupiter_version")
//
//
//    // -------- MOCKITO
//    def mockito_version = "2.19.0"
//    testImplementation("org.mockito:mockito-core:$mockito_version")
}
