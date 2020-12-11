plugins {
    java
}
val projectGroup: String by project
val projectVersion: String by project
group = projectGroup
version = projectVersion


allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        val junitVersion: String by project

        testImplementation("org.junit.jupiter", "junit-jupiter-api", junitVersion)
    }

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
    }
}


