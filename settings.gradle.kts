pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "cubesquad-core"

include("cubesquad-api", "cubesquad-server")
