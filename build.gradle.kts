plugins {
    id("java")
    id("org.springframework.boot") version "3.2.3"
}

group = "org.korett"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.1")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.1")
    runtimeOnly("org.postgresql:postgresql:42.6.0")

    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}