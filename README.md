# Sandbox

A Kotlin Multiplatform (KMP) project targeting Android, iOS, Web (Wasm & JS), Desktop (JVM), and Server (Ktor). This project uses Compose Multiplatform for shared UI across client platforms.

## 🛠 Tech Stack

- **Language:** [Kotlin](https://kotlinlang.org/) (2.3.0)
- **UI Framework:** [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/) (1.9.3)
- **Backend:** [Ktor](https://ktor.io/) (3.3.3)
- **Package Manager:** Gradle (Kotlin DSL)
- **Platforms:** 
  - Android
  - iOS (SwiftUI entry point)
  - Web (WebAssembly & JavaScript)
  - Desktop (JVM)
  - Server (JVM)

## 📁 Project Structure

- `composeApp/`: Contains the shared Compose Multiplatform UI code.
  - `commonMain/`: UI and logic shared across all client platforms.
  - `androidMain/`, `iosMain/`, `jvmMain/`, `webMain/`: Platform-specific UI implementations and entry points.
- `shared/`: Shared logic (non-UI) used by both the client applications and the server.
- `server/`: Ktor server application.
- `iosApp/`: Native iOS application (SwiftUI) that hosts the shared Compose UI.

## 📋 Requirements

- **JDK:** 17 or higher (recommended 21+)
- **Android Studio:** Ladybug or newer (for Android development)
- **Xcode:** 15.0+ (for iOS development, macOS only)
- **Gradle:** Wrapper provided (`./gradlew`)

## 🚀 Setup & Run

### Android
- Run from Android Studio or:
  ```bash
  ./gradlew :composeApp:assembleDebug
  ```

### Desktop (JVM)
  ```bash
  ./gradlew :composeApp:run
  ```

### Server (Ktor)
  ```bash
  ./gradlew :server:run
  ```

### Web
- **Wasm (Recommended):**
  ```bash
  ./gradlew :composeApp:wasmJsBrowserDevelopmentRun
  ```
- **JS:**
  ```bash
  ./gradlew :composeApp:jsBrowserDevelopmentRun
  ```

### iOS
- Open `iosApp/iosApp.xcodeproj` in Xcode and run on a simulator or device.
- Or use the Kotlin Multiplatform Wizard's generated run configurations in IntelliJ IDEA/Android Studio.

## 📜 Available Scripts

| Command | Description |
|---------|-------------|
| `./gradlew tasks` | List all available Gradle tasks |
| `./gradlew :composeApp:run` | Run the Desktop application |
| `./gradlew :server:run` | Run the Ktor server |
| `./gradlew build` | Build the entire project |
| `./gradlew clean` | Clean build artifacts |
| `./gradlew allTests` | Run tests across all targets |

## 🧪 Testing

Run tests for specific modules or all at once:

- **All Tests:** `./gradlew allTests`
- **Shared Logic:** `./gradlew :shared:allTests` (or target specific like `jvmTest`)
- **Compose App:** `./gradlew :composeApp:allTests`
- **Server:** `./gradlew :server:test`

## ⚙️ Environment Variables

- `JAVA_HOME`: Path to your JDK installation.
- `ANDROID_HOME`: (Optional) Path to your Android SDK.
- `OVERRIDE_KOTLIN_BUILD_IDE_SUPPORTED`: (iOS only) Set to `YES` to skip Gradle build task invocation during Xcode builds if managed by IDE.

## 📝 License

This project is licensed under the [MIT License](./LICENSE).

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [YouTrack](https://youtrack.jetbrains.com/newIssue?project=CMP).