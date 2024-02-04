plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("com.example.app.App")
}

tasks.jar {
    manifest.attributes["Main-Class"] = "com.example.app.App"
}
