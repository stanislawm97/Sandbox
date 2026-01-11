### Project Guidelines

#### Build & Configuration
- **JDK Requirement**: JDK 17+ (JDK 21 recommended).
- **Gradle Wrapper**: Always use `./gradlew` for builds to ensure consistency.
- **Targets**:
  - `composeApp`: Client UI (Android, iOS, Desktop JVM, Web WASM/JS).
  - `shared`: Shared logic (Kotlin Multiplatform).
  - `server`: Backend (Ktor on JVM).
- **Core Commands**:
  - Build all: `./gradlew build`
  - Run Desktop: `./gradlew :composeApp:run`
  - Run Server: `./gradlew :server:run`
  - Run Wasm: `./gradlew :composeApp:wasmJsBrowserDevelopmentRun`

#### Testing Information
This project uses `kotlin.test` for multiplatform modules and Ktor Test Host for the server.

- **Running Tests**:
  - Run all tests: `./gradlew allTests`
  - Run shared module tests: `./gradlew :shared:allTests`
  - Run specific target (e.g., JVM): `./gradlew :shared:jvmTest`
  - Run server tests: `./gradlew :server:test`

- **Adding New Tests**:
  - **Shared/ComposeApp**: Place tests in `src/commonTest/kotlin` to run them across all platforms. Use `@Test` from `kotlin.test`.
  - **Server**: Place tests in `src/test/kotlin`. Use `testApplication` from `io.ktor.server.testing`.

- **Demonstration**:
  A typical common test looks like this:
  ```kotlin
  class GuidelineDemoTest {
      @Test
      fun demoTest() {
          assertTrue(true, "This is a demonstration test for guidelines.")
      }
  }
  ```
  Execution verified using `./gradlew :shared:allTests`.

#### Development Information
- **Code Style**: Follow standard Kotlin coding conventions. 
- **Dependencies**: Managed in `gradle/libs.versions.toml`.
- **Platform Specifics**: Use `expect`/`actual` in `shared` module for platform-specific APIs. 
- **JVM Target**: Android and Shared modules target JVM 11 compatibility.
