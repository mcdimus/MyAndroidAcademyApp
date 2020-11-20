// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:4.1.1")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")

    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

tasks.register<Delete>("clean") {
  delete = setOf(rootProject.buildDir)
}

tasks.withType<Wrapper> {
  gradleVersion = "6.7"
  distributionType = Wrapper.DistributionType.BIN
}
