pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io")}
        maven{ url =uri("https://maven.aliyun.com/repository/jcenter") }

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io")}
        maven{ url =uri("https://maven.aliyun.com/repository/jcenter") }

    }
}

rootProject.name = "AndroidJetPack"
include(":app")
 