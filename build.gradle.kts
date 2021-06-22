plugins {
    id("io.quarkus")
    java
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project
val testcontainersVersion: String by project
val mockitoVersion: String by project
val lombokVersion: String by project


repositories {
    maven {
        url = uri("https://repo1.maven.org/maven2/")
        mavenCentral()
    }
}

configurations.all {
    exclude("org.jboss.slf4j", "slf4j-jboss-logmanager")
    resolutionStrategy {
        force("org.slf4j:slf4j-api:2.0.0-alpha1")
    }
}

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-resteasy")
    implementation("io.quarkus:quarkus-resteasy-jsonb")

    // YAML configuration
    implementation("io.quarkus:quarkus-config-yaml")

    // Testing
    testImplementation("io.quarkus:quarkus-junit5")
}

group = "com.testing"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.addAll(listOf("-parameters"))
}

