plugins {
    `java-library`
    kotlin("jvm")
    id("maven-publish")

}
group = "com.fermion.android"

dependencies {
    implementation("com.squareup:kotlinpoet:1.14.2")
    implementation("com.google.devtools.ksp:symbol-processing-api:1.9.0-1.0.13")
}
//

afterEvaluate {
//    println("Components: " + components.names)
    publishing {
        publications {
            register<MavenPublication>("maven") {
//                println(components["release"])
//                from(components["release"])
                groupId = "com.fermion.android"
                artifactId = "dagger-processor"
                version = "1.0.0"
                from(components["java"])
//            }
            }
        }
    }
}

