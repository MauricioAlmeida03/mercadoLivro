plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	kotlin("plugin.jpa") version "1.9.25"
	id("org.springframework.boot") version "3.3.4"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.mercadolivro"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(21))
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.gradle.org/gradle/libs-releases-local") }
}


dependencies {

	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	implementation("org.springframework.boot:spring-boot-starter-web")

	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

	implementation("org.jetbrains.kotlin:kotlin-reflect")

	testImplementation("org.springframework.boot:spring-boot-starter-test")

	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	runtimeOnly("mysql:mysql-connector-java:8.0.12")

	implementation("org.flywaydb:flyway-core")
	implementation("org.flywaydb:flyway-mysql")

}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
