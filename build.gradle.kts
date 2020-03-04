plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val log4jVersion:String = "2.13.1"
val lombokVersion:String = "1.18.12"

dependencies {
    annotationProcessor("org.projectlombok:lombok:${lombokVersion}")

    implementation("org.projectlombok:lombok:${lombokVersion}")
    implementation("org.apache.commons:commons-lang3:3.9")

    implementation("org.apache.logging.log4j:log4j-core:${log4jVersion}")
    implementation("org.apache.logging.log4j:log4j-api:${log4jVersion}")

    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}